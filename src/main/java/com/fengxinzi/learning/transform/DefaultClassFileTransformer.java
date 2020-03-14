package com.fengxinzi.learning.transform;

import javassist.*;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * <pre>
 *     实现ClassFileTransformer的目的是，加载class字节码之前将class的字节码修改替换掉，从而达到动态修改代码的功能
 * </pre>
 * @author fengxinzi
 */
public class DefaultClassFileTransformer implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classFileBuffer) throws IllegalClassFormatException {

        byte[] classByte = null;

        className = className.replaceAll("/", "\\.");

        ClassPool classPool = ClassPool.getDefault();
        classPool.insertClassPath(new LoaderClassPath(loader));
        CtClass ctClass = null;

        try {

            /*if (className.startsWith("org.springframework.web.servlet")) {
                if ("org.springframework.web.servlet.DispatcherServlet".equals(className)) {
                    ctClass = classPool.get("org.springframework.web.servlet.DispatcherServlet");
                    CtMethod doService = ctClass.getDeclaredMethod("doService");
                    getMsgByDispatcherServlet(doService);
                }
            }*/

            // 拦截controller包内的执行方法
            if (className.startsWith("com.fengxinzi.learning.controller")) {
                ctClass = classPool.makeClass(new ByteArrayInputStream(classFileBuffer));
                if (!ctClass.isInterface()) {
                    CtMethod[] ctMethods = ctClass.getDeclaredMethods();
                    for (CtMethod ctMethod : ctMethods) {
                        if (!ctMethod.isEmpty()) {
                            monitorMethodInvoke(ctMethod);
                        }
                    }
                }
                classByte = ctClass.toBytecode();
            }

        } catch (Exception e) {
            System.err.println("instrumentation executed fail: " + className + ", exception msg: " + e.getMessage());
        }

        return classByte;
    }

    /**
     * 监控方法耗时
     * @param method javassist反射方法
     * @throws CannotCompileException
     */
    private void monitorMethodInvoke(CtMethod method) throws CannotCompileException {

        method.instrument(new ExprEditor(){
            @Override
            public void edit(MethodCall methodCall) throws CannotCompileException {
                final StringBuilder builder = new StringBuilder();
                builder.append("{")
                        .append("long start = System.nanoTime()/1000;\n")
                        .append("$_ = $proceed($$);\n")
                        .append("System.out.println(\"执行方法:[")
                        .append(method.getDeclaringClass().getName()).append(".").append(method.getName())
                        .append("]")
                        .append(" 耗时: \" + ").append("(System.nanoTime()/1000 - start) + \" ms\"").append(");")
                        .append("}");
                methodCall.replace(builder.toString());
            }
        });
    }

    /**
     * 硬编码--不推荐
     * @param ctClass
     * @throws NotFoundException
     * @throws CannotCompileException
     */
    private void getCtClass(CtClass ctClass) throws NotFoundException, CannotCompileException {
        CtMethod method = ctClass.getDeclaredMethod("sayHello");
        method.insertBefore("System.out.println(\"开始执行sayHello方法:\" + System.currentTimeMillis());");
        CtMethod newMethod = CtNewMethod.copy(method, "sayHello", ctClass, null);
        newMethod.setName("sayHello$agent");
        newMethod.setBody("{ long start = System.currentTimeMillis();\n" +
                "        String result = sayHello$agent($$);\n" +
                "        long end = System.currentTimeMillis();\n" +
                "        System.out.println(\"执行sayHello方法耗时:\" + (end - start));\n" +
                "        return result; }");
        ctClass.addMethod(newMethod);
    }

    /**
     * 从DispatcherServlet获取http请求信息
     * @param doService
     */
    private void getMsgByDispatcherServlet(CtMethod doService) throws Exception {

            doService.instrument(new ExprEditor(){
                @Override
                public void edit(MethodCall methodCall) throws CannotCompileException {
                    methodCall.replace("{ long start = System.nanoTime()/1000;\n" +
                            "$_ = $proceed($$);\n" +
                            "System.out.println(\"" + "执行方法: "
                            + doService.getDeclaringClass().getName() + "." + doService.getName()
                            + " 耗时:\" + (System.nanoTime()/1000 - start) + \" ms\");} ");
                }
            });
    }
}
