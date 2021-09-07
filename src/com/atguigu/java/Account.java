package com.atguigu.java;

public class Account {
    private int id;
    private double balance;
    private double annuallInterestRate;

    public void Acoount(int id, double balance, double annuallInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallInterestRate = annuallInterestRate;
    }

    public int getId() {
        return id;
    }

    /**
     * 123
     *
     * @param id 代表学号
     */
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallInterestRate() {
        return annuallInterestRate;
    }

    public void setAnnuallInterestRate(double annuallInterestRate) {
        this.annuallInterestRate = annuallInterestRate;
    }

    /**
     * 取钱
     *
     * @param amount
     */
    public void withdraw(double amount) {

        if (balance < amount) {
            System.out.println("余额不足，取款失败。");
            return;
        }
        balance -= amount;
        System.out.println("成功取出：" + amount);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);

        }
    }
}
