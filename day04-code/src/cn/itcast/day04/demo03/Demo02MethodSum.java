package cn.itcast.day04.demo03;

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("1-100的和" + getSum());

    }
    /*

     */
    public static int getSum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }



}
