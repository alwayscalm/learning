package com.fengxinzi.learning.spi;

/**
 *
 * @author fengxinzi
 * @date 2020/3/4 Time: 下午9:15
 */
public class HelloStrategyImpl implements Strategy {

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
