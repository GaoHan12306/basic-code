package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author Han
 * @Date 2020/8/6 21:12
 * @Version 1.0  @Title：生成6个1-33之间的随机整数，添加到集合，并遍历集合
 */
public class Demo01ArryListRandomCopy {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(33)+1);
        }
        System.out.println(list);


    }


}
