package com.atguigu.exer2;

import java.util.List;

public class DAO<T> {   //操作表的共性的操作

    //添加一条记录
    public void add(T t) {

    }

    //删除一条记录
    public boolean remove() {
        return false;
    }

    //修改一条记录
    public void update(int index, T t) {

    }

    //查询一条记录
    public T getIndex(int index) {
        return null;
    }

    //查询多条记录
    public List<T> getForList(int index) {
        return null;
    }


}
