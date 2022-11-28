package com.xiaohe.demo01.PTA126;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:48
 */
public class Main {
    private static long[] arr = new long[21];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        jiecheng();
        while(s.hasNext()) {
            long n = s.nextLong();
            long m = s.nextLong();
            long answer = process(n, m);
            System.out.println(answer);

        }
    }

    private static long process(long n, long m) {
        long answer = 0;
        answer = arr[(int) n] / (arr[(int) m] * arr[(int) (n-m)]);
        return answer;
    }
    private static void jiecheng() {
        arr[1] = 1;
        for (int i = 2; i < 21; i++) {
            arr[i] = arr[i-1] * i;
        }
    }
}
