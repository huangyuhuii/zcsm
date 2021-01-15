package com.family.zcsm.util;

public class Hexadecimal {

    public static void main(String[] args) {
        System.out.println(strToHex("黄煜晖"));
        System.out.println(strToHex("朱陈诗萌"));

    }

    public static String strToHex(String s){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str.append(s4);
        }
        return str.toString();
    }
}
