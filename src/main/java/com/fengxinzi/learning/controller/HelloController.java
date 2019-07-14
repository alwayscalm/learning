package com.fengxinzi.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengxinzi
 */
@RestController
@RequestMapping("/fengxinzi")
public class HelloController {

    /**
     * 演示示例
     * @param name 参数
     * @return 提示信息
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return String.format("很高兴遇见你, %s", name);
    }
}
