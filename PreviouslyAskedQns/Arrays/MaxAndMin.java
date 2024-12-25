package com.Barath.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,7,10};
        System.out.println(findTheMaxAndMin(arr));
    }
    static List<Integer> findTheMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
