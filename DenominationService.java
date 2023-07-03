package com.greatlearning.services;

import java.util.*;

public class DenominationService {
    Scanner scanner;

    public DenominationService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] getDenominations() {
        System.out.println("enter the size of currency denominations ");
        int size = scanner.nextInt();
        int[] denominations = new int[size];
        System.out.println("enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }
        return denominations;
    }

    public void countNotes(int[] denominations, int amount) {
        LinkedHashMap<Integer, Integer> notesMap = new LinkedHashMap<>();
        for (int denomination : denominations) {
            try {
                int count = amount / denomination;
                if (count >= 1) {
                    notesMap.put(denomination, count);
                    amount -= (denomination * count);
                }
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
        if (amount > 0) {
            System.out.println("Cannot pay the amount with highest denomination");
            return;
        }
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int key : notesMap.keySet()) {
            System.out.println(key + ":" + notesMap.get(key));
        }
    }
}
