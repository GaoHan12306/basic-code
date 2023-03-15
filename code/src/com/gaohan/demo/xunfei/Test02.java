package com.gaohan.demo.xunfei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Han
 * @Date 2020/8/29 18:59
 * @Version 1.0  @Title：
 */
public class Test02 {
    public static void quickSort(int[] array, int start, int end){

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
        Scanner one = new Scanner(System.in);
        int length = one.nextInt();
        int[] arrayint = new int[length];
        Scanner two = new Scanner(System.in);
        String strs =two.nextLine();
        String[] array = strs.split(",");
        for (int i = 0; i < length; i++) {
            arrayint[i] = Integer.parseInt(array[i]);
        }

//        int [] array = {7,5,1,8,3,9,11,8};
//        quickSort(arrayint, 0,array.length-1);
        Arrays.sort(arrayint);

        for (int i = 0; i < arrayint.length; i++) {
            System.out.print(arrayint[i]);
            if (i < length-1)
            System.out.print(",");
        }

    }
}
