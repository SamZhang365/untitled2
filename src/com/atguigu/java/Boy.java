package com.atguigu.java;

public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    /**
     * 一个参数的构造器
     *
     * @param name
     */
    public Boy(String name) {
        this.name = name;
    }

    /**
     * 两个参数的构造器
     *
     * @param name
     * @param age
     */
    public Boy(String name, int age) {
        this.name = name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gatAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if (this.age>=22){
            System.out.println("你可以去合法登记结婚了！");
        }else{
            System.out.println("先去多谈谈恋爱！");
        }
    }
}
