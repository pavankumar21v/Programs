package com.string;

import main.java.com.pojo.Employee;

public class Compare {
    public static void main(String[] args) {

        String s1 = "Pavan";
        String s2 = "PAVAN";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

        s1 = s2;
        System.out.println(s1);
        s1 = "Kumar";
        System.out.println(s2);

        s1 = new String(s2);
        s1.intern();
        System.out.println(s1 == s2);

        System.out.println("0 - " + (int) '0');
        System.out.println("A - " + (int) 'A');
        System.out.println("a - " + (int) 'a');

        System.out.println(s1.subSequence(1, s1.length()));
        System.out.println(s1.substring(0, 2));
        System.out.println(s1.substring(1));

        Employee emp = new Employee();
        emp.setName(s1);

        Employee emp1 = new Employee();
        emp1.setName(s1);

        if (emp1.getName() == emp.getName()) {
            System.out.println("Equal");
        }
    }
}
