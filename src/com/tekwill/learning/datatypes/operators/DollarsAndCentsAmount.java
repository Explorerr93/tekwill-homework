package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DollarsAndCentsAmount {
    public static final double TAX= 5.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount");
        double amount = scanner.nextDouble();
        double addamount = (amount * TAX) / 100;
        addamount += amount;
        System.out.printf("With tax added: $%.2f",addamount);
    }
}
