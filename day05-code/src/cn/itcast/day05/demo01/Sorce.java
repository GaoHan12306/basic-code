package cn.itcast.day05.demo01;

import java.util.Scanner;

/*
90-100 优秀
80-89 好
70-79 良
60-69 及格
60以下 不及格
*/

public class Sorce{
    public static void main(String[] arg){
        Sorce so = new Sorce();
        Scanner shuru  = new Scanner(System.in);
        System.out.println("请输入成绩");
        int socre = shuru.nextInt();
        so.judge(socre);
        //int socre  = 100;
    }
    public void judge(int socre){
        if(socre<0 && socre >100)
        {
            System.out.println(" 输入成绩错误 ");
        }else if(socre>=90 && socre<= 100){
            System.out.println("优秀");

        }else if(socre>=80 && socre<=89){
            System.out.println("好");
        }else if(socre>=70 && socre<=79){
            System.out.println("良好");
        }else if(socre>=60 && socre<=69){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

    }


}