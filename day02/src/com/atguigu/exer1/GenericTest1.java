package com.atguigu.exer1;

import org.junit.Test;

import java.util.List;

public class GenericTest1 {
    @Test
    public void test1() {
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        Order<String> order1 = new Order<>("orderAA", 1001, "abc");
        order1.setOrderT("hello");
    }

    @Test
    public void test2() {
        SubOrder sub1 = new SubOrder();
        sub1.setOrderT(1122);
    }

    /**
     * 测试泛型方法
     */
    @Test
    public void test4() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);

    }


}
