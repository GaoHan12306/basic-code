package cn.itcast.day09.demo14copy;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author Han
 * @Date 2021/7/15 16:05
 * @Version 1.0  @Title：
 */
public class Member extends User {
    public Member(){


    }

    public Member(String username, double leftMoney) {
        super(username, leftMoney);
    }
    public void openHongBao(ArrayList<Double> list){
        Random r = new Random();
        int index = r.nextInt(list.size());
        double money = list.remove(index);
        setLeftMoney(money);

    }
}
