package com.gaohan.demo.pufa;

/**
 * @Author Han
 * @Date 2020/10/18 22:11
 * @Version 1.0  @Title： 浦发测试题
 */
import java.util.*;
public class Main01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i <= N; i++){//n个小孩编号
            list.add(i);
        }
        int point =0;
        int number =1;
        while(list.size()>1){
            if(number%3 == 0){
                list.remove(point);//去除3的倍数的编号；
                --point;//解决remove陷阱
            }
            ++point;
            ++number;
            if(point>list.size()-1){
                point = 0;
            }
        }
        System.out.println(list.get(0));
    }
}
