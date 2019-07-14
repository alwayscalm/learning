package com.fengxinzi.learning.practice.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * @author fengxinzi <wangjianhua@youzan.com>
 * Date: 2019/3/20 Time: 上午11:23
 */
public class JdkDynamic {

    public static void main(String[] args) {
        Teacher teacher = new EnglishTeacher();
    }

    class MyInvocationHandler implements InvocationHandler {

        private Teacher teacher;

        public MyInvocationHandler(Teacher teacher) {
            this.teacher = teacher;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("-------before-------");
            Object ret = method.invoke(teacher, args);
            System.out.println("-------after--------");
            return ret;
        }
    }

    interface Teacher {
        /**
         * 教授课程
         */
        void teacher();
    }

    static class EnglishTeacher implements Teacher {

        @Override
        public void teacher() {
            System.out.println("teacher english");
        }
    }

}
