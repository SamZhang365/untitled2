package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
//        coll.add(new Data());
//        System.out.println(coll.size());
        Collection coll1=new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
    }



}
