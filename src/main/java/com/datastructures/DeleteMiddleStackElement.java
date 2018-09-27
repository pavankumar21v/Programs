package com.datastructures;

import java.util.Stack;

public class DeleteMiddleStackElement {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        stk.forEach(System.out :: println);
        deleteMidElement(stk);

        System.out.println("After deletion");
        stk.forEach(System.out :: println);
    }

    private static void deleteMidElement(Stack stk) {
        stk.remove(stk.size() / 2);
    }
}
