package org.example;

public class Template {
    public String reverseString(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
