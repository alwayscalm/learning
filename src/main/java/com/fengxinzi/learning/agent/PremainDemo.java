package com.fengxinzi.learning.agent;

import com.fengxinzi.learning.transform.DefaultClassFileTransformer;

import java.lang.instrument.Instrumentation;

/**
 * @author fengxinzi
 * @date 2019/1/1 Time: 20:02:23
 */
public class PremainDemo {

    /**
     * premain entry point
     * @param agentArgs 注意这里是单个字符串而不是字符串数组,需要程序自己去解析，下同
     */
    public static void premain(String agentArgs) {
        System.err.printf("premain方法开始执行...agentArgs: %s", agentArgs);
    }

    /**
     * premain entry point
     * @param agentArgs 同上
     * @param instrumentation instrument
     */
    public static void premain(String agentArgs, Instrumentation instrumentation) {

        System.err.printf("premain方法开始执行...agentArgs: %s", agentArgs);

        instrumentation.addTransformer(new DefaultClassFileTransformer());
    }
}
