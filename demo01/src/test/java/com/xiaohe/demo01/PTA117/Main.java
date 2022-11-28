package com.xiaohe.demo01.PTA117;


import java.util.HashSet;

import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (!set.contains(a)) {
                System.out.print(a + " ");
            }
            set.add(a);
        }

    }
}

