package com.Barath.Arrays;

public class FindThePivot {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr) {
        int tot = 0;
        for (int i : arr) {
            tot += i;
        }
        int leftsum = 0;
        for (int i=0;i< arr.length;i++) {
            if (2 * leftsum + arr[i] == tot) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
