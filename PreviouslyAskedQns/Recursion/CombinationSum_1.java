package com.Barath.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(arr,target));
    }
    static List<List<Integer>> combinationSum(int[] arr,int target) {
        List<List<Integer>> all = new ArrayList<>();
        findCombinationSum(all,0,arr,target,new ArrayList<>());
        return all;
    }
    static void findCombinationSum(List<List<Integer>> all,int ind,int[] arr,int target,List<Integer> ans) {
        if (ind == arr.length) {
            if (target == 0) {
                all.add(new ArrayList<>(ans));
            }
            return;
        }
        if (arr[ind] <= target) {
            ans.add(arr[ind]);
            findCombinationSum(all,ind, arr,target-arr[ind],ans);
            ans.remove(ans.size()-1);
        }
        findCombinationSum(all,ind+1,arr,target,ans);
    }
}
