package com.Barath.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,1,1};
        int n = 6;
        int[] res = optimal(arr,n);
        System.out.println("Repeating : " + res[0]);
        System.out.println("Missing : " + res[1]);
    }
    static int[] find(int[] arr,int n){
        int repeating = -1,missing = -1;
        for (int i=1;i<=n;i++){
            int cnt = 0;
            for (int j=0;j<n;j++){
                if (arr[j] == i) cnt ++;
                if (cnt == 2) repeating = i;
                if (cnt == 0) missing = i;
                if (repeating != -1 && missing != -1){
                    break;
                }
            }
        }

        return new int[] {repeating,missing};
    }
    static int[] optimal(int[] arr,int n){
        int sn = (n*(n+1)) / 2,s2n = (n*(n+1) * (2*n+1)) / 6;
        int s = 0,s2 = 0;
        for (int i=0;i<n;i++){
            s += arr[i];
            s2 += arr[i] * arr[i];
        }
        int ans1 = s - sn;
        int ans2 = s2 - s2n;
        ans2 = ans2 / ans1;
        int x = (ans1 + ans2) / 2;
        int y = x - ans1;
        return new int[] {x,y};
     }
}
