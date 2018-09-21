package com.string;

import java.util.HashMap;

import static java.lang.System.out;

class EachCharCount {
    private static void characterCount() {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = "Java J2EE Java JSP J2EE".toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        out.println(charCountMap);
    }

    public static void main(String[] args) {
        characterCount();
    }
}