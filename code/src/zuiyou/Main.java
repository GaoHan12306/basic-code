package zuiyou;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author Han
 * @Date 2020/9/10 19:28
 * @Version 1.0  @Title：
 */




public class Main {


    //定义36进制数字
//    private static final String X36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String X36 = "0123456789abcdefghijklmnopqrstuvwxyz";
    //拿到36进制转换10进制的值键对
    private static HashMap<Character, Integer> thirysixToTen = createMapThirtysixToTen();
    //定义静态进制数
    private static int BASE = 36;
    //用来存放10转36进制的字符串
    private static StringBuffer sb = new StringBuffer();

    private static HashMap<Character, Integer> createMapThirtysixToTen() {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < X36.length(); i++) {
            //0--0,... ..., Z -- 35的对应存放进去
            map.put(X36.charAt(i), i);
        }
        return map;
    }


    /** 36 to 10
     * @param pStr 36进制字符串
     * @return  十进制
     */
    public static long ThirtysixToDeciaml(String pStr) {
        if (pStr == "") return 0;
        //目标十进制数初始化为0
        long deciaml = 0;
        //记录次方,初始为36进制长度 -1
        long power = pStr.length() - 1;
        //将36进制字符串转换成char[]
        char[] keys = pStr.toCharArray();
        for (int i = 0; i < pStr.length(); i++) {
            //拿到36进制对应的10进制数
            long value = thirysixToTen.get(keys[i]);
            deciaml = (long) (deciaml + value*Math.pow(BASE, power));
            //执行完毕 次方自减
            power --;
        }
        return deciaml;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.charAt(0) == '-') {
            String str1 = str.substring(1);
            if(isWrong(str1) == 0) {
                long x = ThirtysixToDeciaml(str1);
                long y = -x;
                System.out.println(y);
            }else {
                System.out.println("0");
            }
        }else {
            if(isWrong(str) == 0) {
                long x = ThirtysixToDeciaml(str);
                System.out.println(x);
            }else {
                System.out.println("0");
            }
        }
    }


    private static int isWrong(String str) {
        for(int i = 0; i < str.length(); i ++) {
            int flag = 0;
            for(int j = 0 ; j < X36.length(); j ++) {
                if(str.charAt(i) == X36.charAt(j)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                return 1;
            }
        }
        return 0;
    }
}
