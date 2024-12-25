package com.Barath.Arrays;

import java.util.ArrayList;

public class Minimum_Coins {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,500,1000};
        System.out.println(findMimCoins(coins,49));
    }
    static ArrayList<Integer> findMimCoins(int[] arr,int v) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i= arr.length-1;i>=0;i--) {
            while (v >= arr[i]) {
                v -= arr[i];
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
