package com.string;

public class EncryptWordPos {
    public static void main(String args[]) {
        String msg = "yum feed";
        StringBuffer res = new StringBuffer();
        String sequence = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            if (ch == ' ') {
                res.append(" ");
            } else {
                res.append(sequence.charAt(sequence.indexOf(ch) + i));
            }
        }

        System.out.println(res.toString());
    }
}
