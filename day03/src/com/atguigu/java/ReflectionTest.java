package com.atguigu.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 63088
 */
public class ReflectionTest {

    /**
     * 反射之前，对于Person的操作
     */
    @Test
    public void test1() {

        //1. 创建Person类的对象
        Person p1 = new Person("Tom", 12);

        //2. 通过对象，调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();

        //在Person类外部，不可以通过Person类的对象调用其内部私用结构
    }

    /**
     * 反射之后，对于Person的操作
     */
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz = Person.class;

        //1. 通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p.toString());

        //2. 通过反射，调用对象指定的属性、方法

        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("**********************");

        //通过反射，可以调用Perosn类中的私有结构。比如，私有的构造器、方法、属性。

        //调用私用的构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);
        System.out.println(p1.toString());
        //两个println这两个的关系不懂

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "HanMeimei");
        System.out.println(p1);

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");
        System.out.println(nation);


    }

    /**
     * 获取CLass的实例的方式
     */
    @Test
    public void test3() throws ClassNotFoundException {
        //方式1:调用运行时类的属性：.class
        Class clazz1=Person.class;
        System.out.println(clazz1);

        //方式2:通过运行时类的对象
        Person p1=new Person();
        Class clazz2=p1.getClass();
        System.out.println(clazz2);

        //方式3 :调用Class的静态方法:forName(String)
        Class clazz3=Class.forName("com.atguigu.java.Person");
        System.out.println(clazz3);

    }


}
