package com.collections;

import java.util.Scanner;

public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for (int i = 0; i < k; i++) {
            leftRotatebyOne(a, n);
        }
        return a;
    }

    static void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        System.out.println("Optimized O(n)");
        leftRotate(a, n, k);
    }

    static void leftRotate(int arr[], int n,
                           int k) {
        int mod = k % n;

        for (int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n]
                    + " ");
    }
}
