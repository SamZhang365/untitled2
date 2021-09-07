package com.atguigu.java4;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test=new AnimalTest();
        test.func(new Dog());

    }
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物：进食");
    }
    public void shout(){
        System.out.println("动物：叫");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃狗粮");
    }
    @Override
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
