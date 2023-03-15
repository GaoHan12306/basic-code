package cn.itcast.day05.demo01;

public class Demo12HundredSum{
    public static void main(String[] args){
        int sum = 0;
        int j = 1;
        for(int i = 1;i <=100;i++){
            if(i%2 ==0)
                sum+= i;
        }
        System.out.println("Sum"+sum);
    }


}