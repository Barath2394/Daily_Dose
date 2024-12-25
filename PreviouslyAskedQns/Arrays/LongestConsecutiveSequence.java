package com.Barath.Arrays;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,1,6,-1};
        System.out.println(findTheLongestSequence(arr));
    }
    static int findTheLongestSequence(int[] arr) {
        Map<Integer,Boolean> mpp = new HashMap<>();
        for (int num : arr) {
            mpp.put(num,false);
        }
        int longest = 0;
        for (int num : arr) {
            int nextNum = num + 1;
            int currentLen = 1;
            while (mpp.containsKey(nextNum) && mpp.get(nextNum) == false) {
                currentLen ++;
                mpp.put(nextNum,true);
                nextNum ++;
            }
            int preNum = num - 1;
            while (mpp.containsKey(preNum) && mpp.get(preNum) == false) {
                currentLen ++;
                mpp.put(preNum,true);
                preNum --;
            }
            longest = Math.max(currentLen,longest);
        }
        return longest;
    }
}
