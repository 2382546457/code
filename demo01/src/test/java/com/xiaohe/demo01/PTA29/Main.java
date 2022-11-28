package com.xiaohe.demo01.PTA29;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-28 14:18
 */
public class Main {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String date = s.next();
            String[] split = date.split("-");
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);

            System.out.println(legallyDate(year, month, day)?"yes":"no");

        }
        public static boolean legallyDate(int year, int month, int day){
            if (year < 2021) return false;
            if (year == 2021 && month < 9) return false;
            if (year == 2021 && month == 9 && day <= 9) return false;

            //定义一个合法月份的天数数组，校验天数是否合法
            int [] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
            //由于平年二月28天，闰年二月29天，需额外赋值
            if((year % 4 == 0 && year %100 != 0) || year % 400 == 0){
                arr[1] = 29; //闰年
            }else{
                arr[1] = 28; //平年
            }

            //校验月份是否合法，0<month<13
            if(month >0 && month < 13){
                if(day <=arr[month-1] && day>0){
                    return true;
                }
            }
            return false;
        }


}
