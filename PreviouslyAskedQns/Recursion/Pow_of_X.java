package com.Barath.Recursion;

public class Pow_of_X {
    public static void main(String[] args) {
        int res = find(5,8);
        System.out.println(res);
    }
    static int find(int x,int y){
        if(y == 0) return 1;
        if(y%2 == 0){
        int res = find(x,y/2);
        return res * res;
        }
        else{
            return find(x,y-1) * x;
        }
    }
}
