package com.xiaohe.demo01.PTA128;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 16:14
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int N = s.nextInt();
        int jiecheng = 1;

        long sum = 0;
        for(int i = 0; i < N; i++) {
            jiecheng *= A;
           sum += jiecheng;
        }
        System.out.println("sum = " + sum);
    }
}
