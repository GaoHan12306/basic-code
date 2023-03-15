package cn.itcast.day04.demo04;

public class Demo02MethodOverloadSame {

    public static void main(String[] args) {
        int a = 10,b = 20;
        System.out.println(isSame(10,20));
        System.out.println(isSame((short)a, (short)b));

    }
    public static boolean isSame(int a,int b)
    {
        System.out.println("int方法的执行");
        return a == b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("short方法的执行");
        return a == b? true:false;
    }
}
