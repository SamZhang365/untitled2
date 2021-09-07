package com.atguigu.java;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy=new Boy("罗密欧",21);
        boy.shout();
        Girl girl=new Girl("朱丽叶",18);
        girl.marry(boy);
    }
}
