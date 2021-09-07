package com.atguigu.exer3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust=new Customer("Jane", "Smith");
        Account acct=new Account(1000, 2000, 0.0123);
        cust.setAccount(acct);
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("customer["+cust.getFirstName()+','+cust.getLastName()+"] has a account: id is "+cust.getAccount().getBalance()
        +"利率 is"+cust.getAccount().getAnnualInterestRate()+"balance is "+cust.getAccount().getBalance());
    }
}
