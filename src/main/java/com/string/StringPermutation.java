package com.string;

public class StringPermutation {
    public static void main(String args[]) {
        String text = "ABC";
        permutation(text, 0, text.length() - 1);
    }

    private static void permutation(String text, int low, int high) {
        if(low == high) { System.out.println(text); }
        else {
            for(int i = low; i <= high; i++) {
                if(shouldSwap(text.toCharArray(), low, i, high)) {
                    text = swap(text, low, i);
                    permutation(text, low + 1, high);
                   //text = swap(text, low, i);
                }
            }
        }
    }

    private static Boolean shouldSwap(char str[], int start, int curr, int n) {
        for (int i = start; i < curr; i++) {
            if (str[i] == str[curr]) {
                return false;
            }
        }
        return true;
    }

    private static String swap(String text, int low, int i) {
        char temp;
        char[] charArray = text.toCharArray();
        temp = charArray[low];
        charArray[low] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }
}
