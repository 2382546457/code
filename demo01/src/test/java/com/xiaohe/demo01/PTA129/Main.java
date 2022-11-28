package com.xiaohe.demo01.PTA129;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 16:38
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String str = s.next();
            int answer = process(str);
            System.out.println("signal#" + (i+1) + ":" + answer);
        }
    }

    private static int process(String str) {
        String regex = "";
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == 'L') {
                regex += "0";
            } else {
                regex += "1";
            }
        }
        int i = Integer.parseInt(regex, 2);
        return i;
    }
}
