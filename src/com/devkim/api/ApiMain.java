package com.devkim.api;

public class ApiMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        sb.append(123);
        System.out.println(sb);

        String string = sb.toString();
        System.out.println(string);
    }
}
