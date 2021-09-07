package com.atguigu.java;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
    @Test
    public void test1() {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);
    }

    @Test
    public void test2() throws IOException {

        Properties pros = new Properties();
        //此时的文件默认在当前的module下
        //读取配置文件的方式1
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        pros.load(fis);

        //读取配置文件的方式2：使用ClassLoader
        //配置文件默认识别为：当前module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is =classLoader.getResourceAsStream("jdbc1.properties");
        pros.load(is);


        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user=" + user + ",password=" + password);


    }
}
