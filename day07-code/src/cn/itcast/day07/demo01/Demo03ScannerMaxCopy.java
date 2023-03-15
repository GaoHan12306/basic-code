package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMaxCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入");
        int a = sc.nextInt();
        System.out.println("请输入");
        int b = sc.nextInt();
        System.out.println("请输入");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大為" + max);
    }


}
