package com.xiaohe.demo01.PTA116;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String str = a + "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4') count++;
        }
        System.out.println(count);
    }
}
