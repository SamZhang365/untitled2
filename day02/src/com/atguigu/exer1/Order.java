package com.atguigu.exer1;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的泛型类
 *
 * @param <T>
 * @author 63088
 */
public class Order<T> {
    String orderName;
    int oderId;
    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order() {
    }

    public Order(String orderName, int oderId, T orderT) {
        this.orderName = orderName;
        this.oderId = oderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", oderId=" + oderId +
                ", orderT=" + orderT +
                '}';
    }

    public <E> List<E> copyFromArrayToList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
