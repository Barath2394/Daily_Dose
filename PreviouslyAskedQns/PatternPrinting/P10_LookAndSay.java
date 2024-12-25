package com.Barath.PatternPrinting;

public class P10_LookAndSay {
    public static void main(String[] args) {
        String str = "1";
        System.out.println(str);
        for (int i=1;i<5;i++) {
            str = generateNextTerm(str);
            System.out.println(str);
        }
    }
    static String generateNextTerm(String str) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        char currentDigit = str.charAt(0);
        for (int i=1;i<str.length();i++) {
            char nextDigit = str.charAt(i);
            if (currentDigit == nextDigit) {
                count ++;
            }
            else {
                ans.append(count).append(currentDigit);
                count = 1;
                currentDigit = nextDigit;
            }
        }
        ans.append(count).append(currentDigit);
        return ans.toString();
    }
}
