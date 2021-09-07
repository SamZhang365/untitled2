package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class StringTest  {
    @Test
    public void test1() {
        String s4 = "abc";

    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "javaEE";
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
    }

    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf1.parse(birth);

    }

}
