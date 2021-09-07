package com.atguigu.p2.util;

import java.util.*;

/**
 * CMUtility工具类：
 * 将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，而不需考虑具体的功能实现细节。
 */
public class CMUtility {
    private static Scanner scan = new Scanner(System.in);

    /**
     * 用于界面菜单的选择。该方法读取键盘，如果用户输入1-5中的任意字符，则方法返回，返回值为用户键入字符
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBorad(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println("选择错误，请重新输入：");
            } else {
                break;
            }
        }
        return c;
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     *
     * @return
     */
    public static char readChar() {
        String str = readKeyBorad(1, false);
        return str.charAt(0);
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值
     *
     * @param defaultVaule
     * @return
     */
    public static char readChar(char defaultVaule) {
        String str = readKeyBorad(1, true);
        return (str.length() == 0) ? defaultVaule : str.charAt(0);
    }

    /**
     * 从键盘读取两个长度不超过2位的整数，并将其作为方法的返回值。
     *
     * @return
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBorad(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultVaule作为返回值
     *
     * @param defaultValue
     * @return
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBorad(2, true);
            if (str.equals("")) {
                return defaultValue;
            }
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
     *
     * @param limint
     * @return
     */
    public static String readString(int limint) {
        return readKeyBorad(limint, false);
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultVaule作为返回值
     * @param limit
     * @param defaultVaule
     * @return
     */
    public static String readString(int limit, String defaultVaule) {
        String str = readKeyBorad(limit, true);
        return str.equals("") ? defaultVaule : str;
    }

//    /**
//     * 用于收入和支出金额的输入，该办法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值。
//     *
//     * @return
//     */
//    public static int readNumber() {
//        int n;
//        for (; ; ) {
//            String str = readKeyBorad(10);
//            try {
//                n = Integer.parseInt(str);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("数字输入错误：请重新输入：");
//            }
//        }
//        return n;
//
//    }
//
//    /**
//     * 用于收入和支出说明的输入，该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值
//     *
//     * @return
//     */
//    public static String readString() {
//        String str = readKeyBorad(20);
//        return str;
//
//    }

    /**
     * 用于确定选择的输入，该方法从键盘读取“y”或者“n”,并将其放回方法的值
     *
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBorad(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误：请重新输入：");
            }

        }
        return c;


    }

    /**
     * 定义readKeyBorad方法，限制输入长度
     *
     * @param limit 限制长度
     * @return
     */
    public static String readKeyBorad(int limit, boolean blankReturn) {
        String line = "";
        while (scan.hasNext()) {
            line = scan.nextLine();
            if (line.length() == 0) {
                if (blankReturn) {
                    return line;
                } else {
                    continue;
                }
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度错误（不大于" + limit + "）");
                continue;
            } else {
                break;
            }
        }
        return line;
    }
}
