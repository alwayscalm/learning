package com.fengxinzi.learning.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fengxinzi <wangjianhua@youzan.com>
 * Date: 2019/4/17 Time: 下午8:54
 */
public class StreamTest {

    @Test
    public void filterTest() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        list.add("c");
        list.add("dddd");

        List<String> b = new ArrayList<>();
        b.add("aaa");
        b.add("c");

        List<String> c = list.stream().filter(a -> !a.equals("aaa")).collect(Collectors.toList());
        for (String s : c) {
            System.out.println(s);
        }
    }

    @Test
    public void removeIfTest() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        list.add("c");
        list.add("dddd");

        List<String> filter = new ArrayList<>();
        filter.add("aaa");
        filter.add("bb");

        list.removeIf(filter::contains);
        for (String c : list) {
            System.out.println(c);
        }
    }
}
