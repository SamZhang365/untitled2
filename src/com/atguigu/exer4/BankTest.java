package com.atguigu.exer4;

public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance=bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户："+bank.getCustomer(0).getFirstName()+" 余额为： "+balance);
        bank.addCustomer("wanli", "yang");
        System.out.println("银行客户个数为： "+bank.getNumberOfCustomer());
    }
}
