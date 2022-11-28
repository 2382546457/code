package com.xiaohe.demo01.PTA100;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(process(str) ? "YES, " + str.length() : "NO, " + str.length());
    }

    private static boolean process(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }
}
