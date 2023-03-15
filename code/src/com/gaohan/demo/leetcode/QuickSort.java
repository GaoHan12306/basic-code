package com.gaohan.demo.leetcode;

import java.util.Arrays;

/**
 * @Author Han
 * @Date 2020/8/11 14:49
 * @Version 1.0  @Title：快速排序
 */
public class QuickSort {
    public static void quickSort(int []array, int start, int end){

        if (start > end){
            return;
        }
        int i = start, j = end;
        int temp = array[start];


        while (i < j){//循环的条件 不相等或不交叉

            while (i < j && array[j] >= temp){
                --j;
            }

            array[i] = array[j];

            while (i < j && array[i] <= temp){
                ++i;
            }

            array[j] = array[i];
        }
        array[i] = temp;
        quickSort(array, start, i-1);
        quickSort(array,i+1, end);

    }

    public static void main(String[] args) {
        int [] array = {7,5,1,8,3,9,11,8};
        quickSort(array, 0,array.length-1);
        System.out.println("排序后的数组：" +Arrays.toString(array));

    }


}
