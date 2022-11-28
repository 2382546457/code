package com.xiaohe.demo01.PTA130;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 16:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[21];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 21; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        String str = s.next();
        String[] split = str.split("=");
        int n = Integer.parseInt(split[1]);
        if(n < 2 || n > 20) {
            System.out.println("No Fibonacci number sum");
        } else {
            int sum  =0;

            for(int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println("s=" + sum);
        }
    }
}
