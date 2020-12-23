package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LoanBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of loan:");
        float loanAmount = scanner.nextFloat();
        System.out.println("Enter interest rate:");
        float rateInterest = scanner.nextFloat();
        System.out.println("Enter monthly payment:");
        float monthlyPayment = scanner.nextFloat();
        float rateInterestPercent = (rateInterest / 100.0f) / 12;
        float firstMonthPayment = (loanAmount - monthlyPayment) + (loanAmount * rateInterestPercent);
        float secondMonthPayment = (firstMonthPayment - monthlyPayment) + (firstMonthPayment * rateInterestPercent);
        float thirdMonthPayment = (secondMonthPayment- monthlyPayment) + (secondMonthPayment * rateInterestPercent);
        System.out.printf("Balance remaining after first payment: $%.2f\n", firstMonthPayment);
        System.out.printf("Balance remaining after second payment: $%.2f\n", secondMonthPayment);
        System.out.printf("Balance remaining after third payment: $%.2f\n", thirdMonthPayment);
    }
}
