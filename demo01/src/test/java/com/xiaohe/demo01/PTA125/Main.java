package com.xiaohe.demo01.PTA125;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            String answer = process(str);
            System.out.println(answer.substring(0, answer.length() - 1));
        }
    }

    private static String process(String str) {
        String[] split = str.split(" ");
        String answer = "";
        for (int i = 0; i < split.length; i++) {
            StringBuilder sb = new StringBuilder(split[i]);

            answer += sb.reverse().toString() + " ";
        }
        return answer;
    }
}
