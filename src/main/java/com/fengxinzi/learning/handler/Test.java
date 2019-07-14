package com.fengxinzi.learning.handler;

/**
 * @author fengxinzi
 */
public class Test {

    public static void main(String[] args) {
        StudentHandler handler = new StudentHandler();

        StuRequest request = new StuRequest();
        request.setClassroom("302班");
        request.setAge("20");
        request.setIdCard("1001");
        request.setName("风信子");

        StuResponse response = new StuResponse();
        response.setSuccess(true);
        response.setIdCard("1002");

        handler.handler(request, response);
    }
}
