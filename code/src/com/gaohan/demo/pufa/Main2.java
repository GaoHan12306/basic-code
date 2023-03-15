package com.gaohan.demo.pufa;

/**
 * @Author Han
 * @Date 2020/10/18 22:17
 * @Version 1.0  @Title：
 */
import java.util.*;
public class Main2 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1,str.length());
        str = str.substring(0,str.length()-1);
        String[] str1 = str.split(",");
        int[] nums = new int[str1.length];
        for(int i = 0;i<nums.length;i++){
            nums[i] = Integer.parseInt(str1[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        list = threeSum(nums);
        System.out.println(list);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 1){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 1) L++;
                else if (sum > 1) R--;
            }
        }
        return ans;
    }
}
