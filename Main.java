package com.greatlearning.driver;

import com.greatlearning.services.TransactionService;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService(scanner);
        int[] transactions = transactionService.getDailyTransactions();
        System.out.println("enter the total no of targets that needs to be achieved");
        int noOfTargets = scanner.nextInt();
        while (noOfTargets > 0) {
            System.out.println("enter the value of target");
            long target = scanner.nextInt();
            transactionService.searchTarget(transactions, target);
            noOfTargets--;
        }
    }
}
