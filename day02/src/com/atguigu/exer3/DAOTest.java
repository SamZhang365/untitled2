package com.atguigu.exer3;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001", new User(1001,34,"zhoujielun"));
        dao.save("1002", new User(1002,24,"kunling"));
        dao.save("1003", new User(1003,14,"caiyilin"));
        List<User> list = dao.list();
//        System.out.println(list);
        list.forEach(System.out::println);

    }

}
