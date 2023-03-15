package com.gaohan.demo.leetcode;

import java.util.Scanner;

/**
 * @Author Han
 * @Date 2020/8/28 16:20
 * @Version 1.0  @Title：
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseInteger(num));
    }

    public static int reverseInteger(int number) {
            // write your code here
            int a = number/100;
            int b = number/10;
            b -= a * 10;
            int c = number % 10;
            return a+(b*10)+(c*100);
        }
}
    

