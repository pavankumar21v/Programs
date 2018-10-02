package com.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int s = sc.nextInt();

        double [] files = new double[n];
        for(int i=0;i<n;i++) {
            files[i] = sc.nextDouble();
        }

        Arrays.sort(files);
        double sum =0;
        for(int i = 0; i < files.length; i++) {
            if(n!=0) {
                int phase = (int) Math.floor(s / n);
                if(files[i]/phase == 0.0d) continue;
                sum += (Math.round(files[i]/phase) == 0 ? 1.0 : Math.round(files[i]/phase));

                double file = files[i];

                for(int j=0; j < files.length; j++) {
                    if(files[j] == 0) continue;
                    files[j] = Math.abs(file - files[j]);
                    if(files[j] == 0) {
                        n = n - 1;
                    }
                }
            }
        }
        System.out.println(Math.round(sum));
    }
}