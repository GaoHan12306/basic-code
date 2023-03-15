package com.gaohan.demo.leetcode;

import java.util.Arrays;

/**
 * @Author Han
 * @Date 2020/8/11 20:40
 * @Version 1.0  @Title：直接插入排序
 */
public class InsertSort {
    private static void insertSort(int[] array) {
        int i,j;
        int temp;
        for ( i = 1; i < array.length; i++) {//从第二个开始插入,与前一个比较
            temp = array[i];
            j = i - 1;
            while (j >= 0 && temp < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }
    }


    public static void main(String[] args) {
        int[] array = {3,4,1,10,3,1,3,4,5};
        insertSort(array);
        System.out.println(Arrays.toString(array));


    }




}
