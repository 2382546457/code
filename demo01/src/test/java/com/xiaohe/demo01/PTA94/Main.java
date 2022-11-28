package com.xiaohe.demo01.PTA94;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:08
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        for (int i = n; i > 0; i--) {
            for (int b = 0; b < a;b++) System.out.print(" ");
            a++;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (a != n) System.out.println();
        }
    }
}
