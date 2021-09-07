package com.atguigu.exer3;

import java.util.*;

public class DAO<T> {
    private Map<String, T> map=new HashMap<>();


    /**
     * 保存T类型的对象到Map成员变量中
     * @param id
     * @param entity
     */
    public void save(String id,T entity){
        map.put(id, entity);
    }

    /**
     * 从map中获得id对应的对象
     * @param id
     * @return
     */
    public T get(String id){
        return map.get(id);
    }

    /**
     * 替换map中key为id的内容，改为entity对象
     * @param id
     * @param entity
     */
    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id, entity);
        }
    }

    /**
     * 返回map中存放的所有T对象
     * @return
     */
    public List<T> list(){
        List<T> list=new ArrayList<>();
        Collection<T> values = map.values();
        for (T t:values){
            list.add(t);
        }
        return list;
    }

    /**
     * 删除指定的id对象
     * @param id
     */
    public void delete(String id){
        map.remove(id);
    }
}
