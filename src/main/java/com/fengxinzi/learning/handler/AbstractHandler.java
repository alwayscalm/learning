package com.fengxinzi.learning.handler;

/**
 * @author fengxinzi
 */
public abstract class AbstractHandler<P, R> {

    public void handler(P request, R result) {
        execute(request, result);
        System.out.println("request:" + request.getClass().getSimpleName());
        System.out.println("result:" + result.getClass().getSimpleName());
        test(request);
    }

    protected abstract void execute(P request, R result);

    private void test(P request) {
        if (request instanceof StuRequest) {
            System.out.println("==============");
            System.out.println("true class name:" + request.getClass().getName());
            System.out.println(((StuRequest) request).getName());
        }
    }
}
