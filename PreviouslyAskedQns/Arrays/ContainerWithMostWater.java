package com.Barath.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,8,9};
        System.out.println(findMaxArea(arr));
    }
    static int findMaxArea(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;

        while (left < right) {
            int currentHeight = Math.min(arr[left],arr[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;

            maxArea = Math.max(currentArea, maxArea);

            if (arr[left] < arr[right]) left ++;
            else right --;
        }
        return maxArea;
    }
}
