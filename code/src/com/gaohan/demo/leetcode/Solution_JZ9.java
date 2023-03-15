package com.gaohan.demo.leetcode;

/**
 * @Author Han
 * @Date 2020/8/5 10:57
 * @Version 1.0  @Title：变态跳台阶
 */
public class Solution_JZ9 {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
    }

    public static int JumpFloorII(int target){
        if (target <=1) return 1;

        return (int)Math.pow(2, target-1);

    }
/*    public static  int JumpFloorII(int target) {
        if (target ==1 || target ==0){
            return 1;
        }
        int []f = new int[target+1];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i <= target; ++i){
            int sum = 0;
            for(int j = 0; j < i; ++j){
                sum = sum + f[j];
            }
            f[i] = sum;
        }
        return f[target];
    }*/
}
