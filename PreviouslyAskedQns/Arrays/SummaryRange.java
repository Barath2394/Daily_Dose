package com.Barath.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,10,11};
        System.out.println(findTheRange(arr));
    }
    static List<String> findTheRange(int[] arr) {
        List<String> ans = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            StringBuilder res = new StringBuilder();
            res.append(arr[i]);
            boolean flag = false;
            int last = -1;
            while (i+1 < arr.length && arr[i+1] == arr[i]+1) {
                ++i;
                flag = true;
                last = arr[i];
            }
            if (flag) {
                res.append("->");
                res.append(last);
            }
            ans.add(res.toString());
        }
        return ans;
    }
}
