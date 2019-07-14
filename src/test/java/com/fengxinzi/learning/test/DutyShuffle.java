package com.fengxinzi.learning.test;

import org.apache.commons.lang3.RandomUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 值班顺序随机洗牌实现
 * <pre>
 *   采用洗牌算法: @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher–Yates
 * shuffle</a>
 * </pre>
 *
 * @author saber
 * @version DutyShuffle.java, v 0.1 2018-12-27 19:56
 */
@Slf4j
public class DutyShuffle {

    /**
     * Fisher–Yates shuffle 洗牌算法原理：
     * 1. 从0开始遍历数组,i是当前索引
     * 2. 取一个随机数数，范围＝[0,数组长度-1]
     * 3. 交换索引 i 和random 的数组值
     */
    public static void shuffle(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int random = RandomUtils.nextInt(0, arr.length - 1);
            if (random != i) {
                String temp = arr[i];
                arr[i] = arr[random];
                arr[random] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] members =
                {"任邦", "柯涛",
                        "谢俐娜", "李华灿",
                        "伍胜胜", "蒿应云", "李策",
                        "黄贤强", "傅垚尧",
                        "裴鹏飞", "王建华"
                };

        //洗牌100次吧
        for (int i = 100; i > 0; i--) {
            shuffle(members);
        }

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }
    }

}
