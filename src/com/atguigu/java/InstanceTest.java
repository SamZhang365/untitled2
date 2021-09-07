package com.atguigu.java;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        //p = null;

        System.out.println(p);
        p.sendEmail();
        p.playGame();
        new Phone().sendEmail();

        PhoneMall mall=new PhoneMall();
        mall.show(new Phone());
        int a;

    }
}

class PhoneMall{

    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();

    }
}

class Phone {
    double price;//价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
    public  void showPrice(){
        System.out.println(price);
    }
}
