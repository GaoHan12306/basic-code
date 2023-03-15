package com.gaohan.demo.leetcode;

import java.util.Arrays;

/**
 * @Author Han
 * @Date 2020/8/11 14:34
 * @Version 1.0  @Title：冒泡排序
 */
public class MaoPaoSort {

    static int[] array = {3,2,4,1,5,0};

    public static void maopaoSort(int[] a)
    {
        //外层循环，是需要进行比较的轮数，一共进行5次即可
        for(int i=0;i<a.length-1;i++)
        {
            boolean flag = false;  // 标志是否交换
            //内存循环，是每一轮中进行的两两比较
            for(int j=0;j<a.length-i-1;j++)
            {

                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag  = true;
                }
            }
            System.out.println("第"+(i+1)+"轮排序后的数组为: "+ Arrays.toString(a));

            if (flag == false){
                return ;
            }
        }
    }

    public static void main(String[] args) {
        maopaoSort(array);
        System.out.println(Arrays.toString(array));
    }
}
