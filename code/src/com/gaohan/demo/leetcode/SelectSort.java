package com.gaohan.demo.leetcode;

import java.util.Arrays;

/**
 * @Author Han
 * @Date 2020/8/11 16:39
 * @Version 1.0  @Title：简单选择排序
 */
public class SelectSort {
    public static void selectsort(int []array){
        int minindex, temp;
        for (int i = 0; i < array.length-1; i++) {
            minindex = i;
            for (int j =i+1; j< array.length;j++){
                if (array[j]< array[minindex]){
                    minindex = j;
                }
            }
            temp = array[i];
            array[i] = array[minindex];
            array[minindex] = temp;
        }

    }
    public static void main(String[] args) {
        int []array ={7,4,2,8,9,3,6,2};

        selectsort(array);
        System.out.println(Arrays.toString(array));

    }


}
