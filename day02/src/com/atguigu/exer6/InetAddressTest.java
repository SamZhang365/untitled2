package com.atguigu.exer6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            InetAddress inet4 = InetAddress.getByName("localhost");
            System.out.println(inet4);

            InetAddress inet5 = InetAddress.getLocalHost();
            System.out.println(inet5);

            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
