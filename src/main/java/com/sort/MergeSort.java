package com.sort;

public class MergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public static void main(String a[]){
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            doMergeSort(low, mid);
            doMergeSort(mid + 1, high);
            mergeParts(low, mid, high);
        }
    }

    private void mergeParts(int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            tempMergArr[i] = array[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
 
        while (i <= mid && j <= high) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
 
        while (i <= mid) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
