package com.gaohan.demo.HuaWei;

import javax.swing.tree.TreeNode;
import java.util.Scanner;

/**
 * @Author Han
 * @Date 2020/9/16 8:50
 * @Version 1.0  @Title：华为 题目2
 */
public class Test02 {
    static int n;
    static int[]arr;//用来记录已经在全排列中的数字
    static int []brr;//标记
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n +1];
        brr = new int[n +1];
        DFS(0);

    }
    static void DFS(int step){
        if (step ==n){//边界输出
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");

            }
            System.out.println();

        }else if (step <n){
            for (int i = 1; i <= n; i++) {
                if (brr[i] ==0){
                    brr[i] =1;//进行标记,已经使用
                    arr[step] =i;
                    DFS(step +1);//进行下一步
                    brr[i] = 0;//清空标记

                }
            }
        }
        else
            return;

    }
}
