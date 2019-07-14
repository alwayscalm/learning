package com.fengxinzi.learning.agent;

import com.sun.tools.attach.VirtualMachine;

import java.lang.instrument.Instrumentation;

/**
 * @author fengxinzi
 * @date 2019/1/1 Time: 20:00:06
 */
public class AgentmainDemo {

    /**
     * agentmain entry point
     * @param agentArgs
     */
    public static void agentmain(String agentArgs) {

        try {
            //attach调用
            VirtualMachine vm = VirtualMachine.attach("pid");
            vm.loadAgent("../agent.jar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * agentmain entry point
     * @param agentArgs
     * @param instrumentation
     */
    public static void agentmain(String agentArgs, Instrumentation instrumentation) {

    }
}
