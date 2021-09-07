package com.atguigu.java;

import org.junit.Test;

import java.util.Random;

/**
 * 通过反射创建对应的运行时类的对象
 */

public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }



    /**
     *     体会反射的动态性
     */
    @Test
    public void test2() {
        //0,1,2
        int num = new Random().nextInt(3);
        String classPath = "";
        switch (num) {
            case 0:
                classPath="java.util.Date";
                break;
            case 1:
                classPath="java.lang.Object";
                break;
            case 2:
                classPath="com.atguigu.java.Person";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }

        try {
            Object obj=getInstance(classPath);
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    /**
     * 创建一个指定类的对象
     *
     * @param classPath 指定类的全类名
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Object getInstance(String classPath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
