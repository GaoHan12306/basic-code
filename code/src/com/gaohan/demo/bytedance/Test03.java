package com.gaohan.demo.bytedance;

import java.util.*;

/**
 * @Author Han
 * @Date 2020/9/6 9:58
 * @Version 1.0  @Title： 招银网络
 */
public class Test03 {
    static List<Integer> trace;
    static Set<Integer> searched = new HashSet<>();
    static Set<List<Integer>> allCircles = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] e = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                e[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        trace = new ArrayList<>();
        findCycle(k, e);
//

        for (List<Integer> list : allCircles){
            if(list.get(0)==k){
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                }
                System.out.println();
            }
        }
    }


    static void findCycle(int v, int[][] e) {
        int j = trace.indexOf(v);
        if (j != -1) {
            List<Integer> circle = new ArrayList<>();
            while (j < trace.size()) {
                circle.add(trace.get(j));
                j++;
            }
//            Collections.sort(circle);
            allCircles.add(circle);
            return;
        }


        trace.add(v);
        for (int i = 0; i < e.length; i++) {
            if (e[v][i] == 1) {
                searched.add(i);
                findCycle(i, e);
            }
        }
        trace.remove(trace.size() - 1);
    }

}
