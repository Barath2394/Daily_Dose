package com.Barath.Recursion;

public class Sum_of_N_numbers {
    public static void main(String[] args) {
        int res = find(5,0);
        System.out.println(res);
    }
    static int find(int n,int ans){
        if(n < 1){
            return ans;
        }
        return find(n-1,ans+n);
    }
}
