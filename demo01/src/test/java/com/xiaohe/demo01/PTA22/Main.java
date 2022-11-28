package com.xiaohe.demo01.PTA22;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 15:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int month = s.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("ERROR");
        } else {
            LocalDate a = LocalDate.of(year, month, 1);
            System.out.println(a.lengthOfMonth());
        }

    }
}
