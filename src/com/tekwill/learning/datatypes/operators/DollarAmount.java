package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DollarAmount {
    public static int SUM_IS_TWENTY = 20;
    public static int SUM_IS_TEN = 10;
    public static int SUM_IS_FIVE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dollar amount:");
        int amount = scanner.nextInt();
        int bilsOf20 = amount / SUM_IS_TWENTY;
        int restAmountOf20 = amount % SUM_IS_TWENTY;
        int bilsOf10 = restAmountOf20 /  SUM_IS_TEN;
        int restAmountOf10 =  restAmountOf20 %  SUM_IS_TEN;
        int bilsOf5 = restAmountOf10 / SUM_IS_FIVE;
        int bilsOf1 =  restAmountOf10 % SUM_IS_FIVE;
        System.out.println("$20 bills : " + bilsOf20);
        System.out.println("$10 bills : " + bilsOf10);
        System.out.println(" $5 bills : " + bilsOf5);
        System.out.println(" $1 bills : " + bilsOf1);
    }
}
