package com.greatlearning.services;

import java.util.Scanner;

public class TransactionService {
    Scanner scanner;

    public TransactionService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] getDailyTransactions() {
        System.out.println("enter the size of transaction array");
        int size = scanner.nextInt();
        int[] transactions = new int[size];
        System.out.println("enter the values of array");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }
        return transactions;
    }

    public void searchTarget(int[] transactions, long target) {
        int count;
        long sum = 0;
        boolean flag = false;
        for (count = 0; count < transactions.length; count++) {
            sum += transactions[count];
            if (sum >= target) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Target achieved after " + (count + 1) + " transactions");
        } else {
            System.out.println("Given target is not achieved");
        }
    }
}
