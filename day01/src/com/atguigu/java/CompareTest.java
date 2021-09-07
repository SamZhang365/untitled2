package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    @Test
    public void test2() {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse", 43);
        arr[2] = new Goods("xiaomiMouse", 12);
        arr[3] = new Goods("huaweiMouse", 65);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3() {
        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return 0;
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }



}
