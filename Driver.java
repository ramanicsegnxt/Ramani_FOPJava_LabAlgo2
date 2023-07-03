package com.greatlearning.driver;

import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.DenominationService;

import java.util.Scanner;

public class Driver {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DenominationService denominationService = new DenominationService(scanner);
        int[] denominations = denominationService.getDenominations();
        BubbleSortImpl sortImpl = new BubbleSortImpl();
        sortImpl.bubbleSort(denominations);
        System.out.println("enter the amount you want to pay");
        int amount = scanner.nextInt();
        denominationService.countNotes(denominations, amount);
    }
}
