package com.atguigu.exer;

/**
 * @author 63088
 */
public class InstanceTest {

    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
//        test.method(new Student());
    }

    public void method(Person e) {
        String info = e.getInfo();
        System.out.println(info);
        if (e instanceof Graduate){
            System.out.println("a graduate student");
            System.out.println("a  student");
            System.out.println("a person");
        }else if(e instanceof Student){
            System.out.println("a  student");
            System.out.println("a person");
        }else{
            System.out.println("a person");
        }
    }

    class Person {
        protected String name = "Person";
        protected int age = 50;

        public String getInfo() {
            return "Name: " + name + "\n" + "age: " + age;
        }
    }

    class Student extends Person {
        protected String school = "pku";

        @Override
        public String getInfo() {
            return "Name: " + name + "\n" + "age: " + age + "\nschool: " + school;
        }
    }

    class Graduate extends Student {
        public String major = "IT";

        @Override
        public String getInfo() {
            return "Name: " + name + "\n" + "age: " + age + "\nschool: " + school + "\nmajor" + major;
        }
    }
}

