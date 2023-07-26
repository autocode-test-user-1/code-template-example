package org.example;

public class Template {
    public String reverseString(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }

    public static boolean isPalindrome(int x) {
        var intToString = String.valueOf(x);
        for (int i = 0; i < intToString.length() - 1; i++) {
            if (intToString.charAt(i) != intToString.charAt(intToString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //feature
}
