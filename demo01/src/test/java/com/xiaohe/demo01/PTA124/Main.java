package com.xiaohe.demo01.PTA124;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 14:36
 */
public class Main {
    private static int flag = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        process(arr, n);
        // 双重循环
        for (int i = flag - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(n+" = " + arr[j] + " + " + arr[i]);
                    System.exit(0);
                }
            }
        }
    }
    // 将小于n的所有素数放入数组
    private static void process(int[] arr, int n) {

        for (int i = 2; i < n; i++) {
            if(isPrime(i)) {
                arr[flag++] = i;
            }
        }
    }
    private static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
