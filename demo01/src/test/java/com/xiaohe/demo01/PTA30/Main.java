package com.xiaohe.demo01.PTA30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String[] split = str.split(",");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        if (b == 0) {
            System.out.println("除数不能为0");
        } else {
            System.out.println(a % b == 0 ? a+"是"+b+"的倍数" : a+"不是"+b+"的倍数");
        }
    }
}
