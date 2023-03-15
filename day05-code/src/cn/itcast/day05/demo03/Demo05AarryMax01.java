package cn.itcast.day05.demo03;

public class Demo05AarryMax01 {
    public static void main(String[] args) {

        int []arrayb = {1,3,4,5,2};
        int max = arrayb[0];
        for (int i = 0; i < arrayb.length; i++) {
             if (max < arrayb[i]){
                 max = arrayb[i];
             }
        }
        System.out.println("最大值" + max);

        

    }


}
