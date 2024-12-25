package com.Barath.Strings;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "rockslife";
        int[] indices = {4,5,6,7,8,0,1,2,3};
        System.out.println(shuffle(s,indices));
    }
    static String shuffle(String str,int[] arr) {
        char[] c = new char[str.length()];

        for (int i=0;i<str.length();i++) {
            c[arr[i]] = str.charAt(i);
        }
        return new String(c);
    }
}
