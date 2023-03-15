package com.gaohan.demo.bytedance;

import java.util.Scanner;

/**
 * @Author Han
 * @Date 2020/9/6 9:58
 * @Version 1.0  @Title：乐信 回文数
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String num = sc.next();
        System.out.println(isLoop(num));

    }
    public static String isLoop(String val){
        StringBuilder str2 = new StringBuilder(val);
        str2.reverse();
        int count = 0;
        if (Long.parseLong(val)>Integer.MAX_VALUE||Long.parseLong(val)<Integer.MIN_VALUE)
            return "error";

        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) != str2.charAt(i)) {
                return "false";
//                System.out.println(val + "不是回文数");
            } else {
                count++;
            }
        }
        if (count == val.length()) {
//            System.out.println(val + "是回文数");
            return "true";
        }
        return "false";
    }
}
