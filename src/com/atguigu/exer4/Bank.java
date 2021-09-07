package com.atguigu.exer4;

public class Bank {
    /**
     * 存放多个客户的数组
     */
    private Customer[] customers = new Customer[10];
    /**
     * 记录客户的个数
     */
    private int numberOfCustomer;

    public Bank() {

    }

    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer++] = cust;

    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
//        return customers[index];
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }

}
