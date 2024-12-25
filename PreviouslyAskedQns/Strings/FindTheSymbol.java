package com.Barath.Strings;

public class FindTheSymbol {
    public static void main(String[] args) {
        String str = "9+3=4";

        // Remove all non-digit characters from the string
        String onlyNum = str.replaceAll("\\D", "");

        // Convert the cleaned string to a char array
        char[] ch = onlyNum.toCharArray();

        // Call findSymbol method to determine the operation between numbers
        char result = findSymbol(ch[0] - '0', ch[1] - '0', ch[2] - '0');

        // Print the result
        if (result == '?') {
            System.out.println("No valid operation found.");
        } else {
            System.out.println("The symbol is: " + result);
        }
    }

    static char findSymbol(int first, int second, int tot) {
        // Check for addition
        if ((first + second) == tot) {
            return '+';
        }
        // Check for subtraction
        else if ((first - second) == tot) {
            return '-';
        }
        // Check for multiplication
        else if ((first * second) == tot) {
            return '*';
        }
        // Check for division (only when second is not zero)
        else if (second != 0 && (first / second) == tot) {
            return '/';
        }
        // Return '?' if no valid operation matches
        else {
            return '?';
        }
    }
}

