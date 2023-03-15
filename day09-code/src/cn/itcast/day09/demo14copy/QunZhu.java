package cn.itcast.day09.demo14copy;

import java.util.ArrayList;

/**
 * @Author Han
 * @Date 2021/7/15 15:09
 * @Version 1.0  @Title：
 */
public class QunZhu extends User {
    int  name;
    public QunZhu(){

    }

    public QunZhu(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public ArrayList<Double> send(int money, int count){
        //获得群主余额
        double leftMoney = getLeftMoney();
        if(money > leftMoney){
            return null;
        }
        setLeftMoney(leftMoney - money);//修改余额

        ArrayList<Double> list = new ArrayList<>();
        money = money *100;
        int m = money/count;
        int l = money%count;

        for (int i = 0; i < count - 1; i++) {
            list.add(m/100.0);
        }

        if (l ==0){
            list.add(m/100.0);
        }
        else {
            list.add((m+l)/100.0);
        }


        return list;
    }
}
