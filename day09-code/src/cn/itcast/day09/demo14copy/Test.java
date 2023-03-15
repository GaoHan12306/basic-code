package cn.itcast.day09.demo14copy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Han
 * @Date 2021/7/15 16:26
 * @Version 1.0  @Title：
 */
public class Test {
    public static void main(String[] args){
        QunZhu qz = new QunZhu("群主", 200);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();
        System.out.println("请输入个数");
        int count = sc.nextInt();

        ArrayList<Double> sendList = qz.send(money, count);
        if (sendList == null ){
            System.out.println("余额不足");
            return;
        }

        //创建三人抢红包
        Member m = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        //打开红包
        m.openHongBao(sendList);
        m2.openHongBao(sendList);
        m3.openHongBao(sendList);

        qz.show();
        m.show();
        m2.show();
        m3.show();



    }
}
