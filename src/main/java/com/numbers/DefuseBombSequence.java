package com.numbers;

import java.util.ArrayList;
import java.util.List;

public class DefuseBombSequence {
    public static void main(String args[]) {
        int size = 4;
        int key = 3;
        int [] msg = {2, 3, 5, 1};
        List list = new ArrayList();

        for(int i=0;i<size;i++) {
            int sum=0;
            int count=0;
            int j = i + 1;

            while(count < key) {
                sum+= msg[j % size];
                j++;
                count++;
            }
            System.out.println(sum);
            list.add(sum);
        }

        assert (!list.isEmpty());
    }
}
