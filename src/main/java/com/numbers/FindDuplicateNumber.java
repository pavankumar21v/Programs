package com.numbers;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {
    public static void main(String... args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) numbers.add(i);
        
        numbers.add(10);
        FindDuplicateNumber dn = new FindDuplicateNumber();
        System.out.println("Duplicate Number: " + dn.findDuplicateNumber(numbers));
    }

    private int findDuplicateNumber(List<Integer> numbers) {
        int size = numbers.size() - 1;
        int total = getSum(numbers);
        return total - (size * (size + 1) / 2);
    }

    private int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}