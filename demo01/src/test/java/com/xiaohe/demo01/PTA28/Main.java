package com.xiaohe.demo01.PTA28;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 14:14
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = 0;
        if (x < 0) {
            y = x * x + 9;
        } else {
            y = x*x*x + 5;
        }
        System.out.printf("%.3f", y);
    }
}
