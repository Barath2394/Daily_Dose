package com.Barath.Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumWithZero {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(optimal(arr));
    }

    static int bruteForce(int[] arr) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    static int optimal(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.get(sum) != null) {
                    max = Math.max(max, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
