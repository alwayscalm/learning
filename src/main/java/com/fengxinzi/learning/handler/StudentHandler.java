package com.fengxinzi.learning.handler;

/**
 * @author fengxinzi
 */
public class StudentHandler extends AbstractNewHandler<StuRequest, StuResponse> {

    @Override
    protected void doExecute(StuRequest request, StuResponse response) {
        System.out.println("class name " + this.getClass().getSimpleName());
        System.out.println("request:" + request.getAge());
        System.out.println("response:" + response.getIdCard());
    }

}
