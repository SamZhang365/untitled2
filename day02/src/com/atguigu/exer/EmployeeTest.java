package com.atguigu.exer;

import org.junit.Test;

import java.util.*;

public class EmployeeTest {
    //问题1
    @Test
    public void test1() {
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 55, new MyDate(1985, 5, 4));
        Employee e3 = new Employee("guofucheng", 55, new MyDate(1957, 5, 4));
        Employee e4 = new Employee("liangchaowei", 55, new MyDate(1978, 5, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //问题2
    @Test
    public void test2() {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                    int minusYear = b1.getYear() - b2.getYear();
                    if (minusYear != 0) {
                        return minusYear;
                    }
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if (minusMonth != 0) {
                        return minusMonth;
                    }
                    return b1.getDay() - b2.getDay();
                }
                throw new RuntimeException("传入的数据类型不一致");

            }
        });
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 55, new MyDate(1985, 5, 4));
        Employee e3 = new Employee("guofucheng", 55, new MyDate(1957, 5, 4));
        Employee e4 = new Employee("liangchaowei", 55, new MyDate(1978, 5, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void Test3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(66);
        list.add(99);
        list.add(65);
//        list.add("haode")
        //方式1
//        for (Integer score:list){
//            int stuScore=score;
//            System.out.println(stuScore);
//        }

        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 87);
        map.put("Jerry", 87);
        map.put("Jack", 67);
//        map.put(123, "abc");

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println(key+"----"+value);
        }
    }

}
