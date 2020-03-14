package com.fengxinzi.learning.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * spi测试入口
 *
 * @author fengxinzi
 * @date 2020/3/4 Time: 下午9:16
 */
public class TestMain {

    public static void main(String[] args) {

        ServiceLoader<Strategy> strategies = ServiceLoader.load(Strategy.class);

        for (Strategy strategy : strategies) {

            strategy.sayHello();
        }
    }
}
