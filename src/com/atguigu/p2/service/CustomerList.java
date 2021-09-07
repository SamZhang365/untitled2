package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

public class CustomerList {
    /**
     * 保存客户对象的数组
     */
    private Customer[] customers;
    /**
     * 记录保存客户对象的数量
     */
    private int total = 0;

    /**
     * 用来初始化customer数组的构造器
     *
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];

    }

    /**
     * 将指定的客户添加到数组中
     *
     * @param customer
     * @return true:添加成功 false:添加失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total] = customer;
        total++;
        return true;


    }

    /**
     * 修改指定索引位置的客户信息
     *
     * @param index
     * @param cust
     * @return true:修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index, Customer cust) {

        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置上的客户
     *
     * @param index
     * @return
     */
    public boolean delectCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;

    }

    public Customer[] getAllCustomers() {

        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     *
     * @param index
     * @return 如果找到了，则返回；如果没有找到，则返回null
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index > total) {
            return null;
        }
        return customers[index];
    }

    /**
     * 得到客户总数
     * @return
     */
    public int getTotal(){
        return total;
    }


}
