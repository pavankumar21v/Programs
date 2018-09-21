package com.string;

import java.util.Arrays;

public class Subsequence {
    static boolean check(String s,
                         int l) {
        int freq[] = new int[26];
        Arrays.fill(freq, 0);

        // iterate and count
        // the frequency
        for (int i = 0; i < l; i++) {
            System.out.println(s.charAt(i) - 'a');
            freq[s.charAt(i) - 'a']++;
        }

        // check if frequency is more
        // than once of any character
        for (int i = 0; i < 26; i++) {
            if (freq[i] >= 2)
                return true;
        }
        return false;
    }

    // Driver Code
    public static void main(String args[]) {
        String s = "geeksforeegks";
        int l = s.length();
        if (check(s, l))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

