package com.gaohan.demo.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Han
 * @Date 2020/8/21 11:31
 * @Version 1.0  @Title：
 */
public class Gh {
        public static int minSubArray(ArrayList<Integer> nums)
        {
            int min=Integer.MAX_VALUE;
            int sum=0;
            for(int i=0;i<nums.size();i++)
            {
                sum=sum+nums.get(i);
                if(sum<min)
                {
                    min=sum;
                }
                if(sum>0)
                    sum=0;
            }

            return min;

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(sc.nextInt());
            }
            System.out.println(minSubArray(list));
        }


    }


