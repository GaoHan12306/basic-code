package com.itheima.demo06.Thread;

/**
 * @Author Han
 * @Date 2021/7/30 10:40
 * @Version 1.0  @Title：
 */
public class Demo02Thread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + i);
                }

            }
        }.start();
    }
}
