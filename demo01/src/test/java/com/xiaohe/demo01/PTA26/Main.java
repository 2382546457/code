package com.xiaohe.demo01.PTA26;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("无穷多解");
        } else if (a == 0 && b != 0) {
            System.out.println("无解");
        } else {
            double answer = -b/a;
            if(answer == 0) answer = 0;
            System.out.printf("x = %g\n" , answer);
        }
    }
}

