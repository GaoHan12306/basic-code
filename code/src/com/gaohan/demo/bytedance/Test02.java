package com.gaohan.demo.bytedance;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Han
 * @Date 2020/9/6 9:58
 * @Version 1.0  @Title：
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(solution("2,2,3,4,3"));


    }
    private static String solution(String value){
        String[] strs = value.split(",");
        int [] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);

        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
        }
        Set<Integer> keyset = map.keySet();
        for (int M : keyset){
            if(map.get(M)==1){
                return String.valueOf(M);
            }
        }
        return null;

    }
}
