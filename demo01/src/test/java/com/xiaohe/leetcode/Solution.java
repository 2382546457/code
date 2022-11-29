package com.xiaohe.leetcode;

/**
 * @author : 小何
 * @Description :
 * @date : 2022-11-29 11:02
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "1111";

        int count = solution.minOperations(str);
        System.out.println(count);

    }
    public int minOperations(String s) {
        // 对比从0开始的字符串与从1开始的字符串，得出最小的那个
        int x = 0;
        int y = 1;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            if (a != x) {
                count1 ++;
            }
            if (a != y) {
                count2++;
            }

            x = x ^ 1;
            y = y ^ 1;
        }

        return count1 >= count2 ? count2 : count1;

    }
}
