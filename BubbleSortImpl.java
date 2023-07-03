package com.greatlearning.services;

public class BubbleSortImpl {
    private void swap(int[] arr, int source, int target) {
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }

    public void bubbleSort(int[] denominations) {
        boolean flag;
        for (int i = 0; i < denominations.length; i++) {
            flag = false;
            for (int j = 1; j < denominations.length - i; j++) {
                if (denominations[j] > denominations[j - 1]) {
                    flag = true;
                    swap(denominations, j, j - 1);
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
