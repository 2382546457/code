package com.xiaohe.demo01.PTA27;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 14:09
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = s.nextInt();
        arr[1] = s.nextInt();
        arr[2] = s.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[2]+">=" + arr[1]+">="+arr[0]);
    }
}
