package com.string;

import java.util.ArrayList;
import java.util.List;

public class CheckStringOrNum {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("2");
        list.add("Pavan");
        list.add("11");

        for (Object obj : list) {
            if (isInt(obj)) {
                System.out.println(obj + " is Integer");
            } else {
                System.out.println(obj + " is String");
            }
        }
    }

    public static Boolean isInt(Object val) {
        try {
            Integer.parseInt(val.toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
