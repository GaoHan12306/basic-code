package cn.itcast.day09.demo14copy;

/**
 * @Author Han
 * @Date 2021/7/15 14:47
 * @Version 1.0  @Title：
 */
public class User {
    //成员变量
    private String username;//用户名
    private double leftMoney; //余额

    public User(){

    }

    public User(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
    public void show(){
        System.out.println("用户名"+username+", 余额为："+leftMoney + "元");
    }
}
