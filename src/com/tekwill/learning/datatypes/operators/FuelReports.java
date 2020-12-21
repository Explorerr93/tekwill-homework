package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class FuelReports {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many km you have driven?");
        int km = scanner.nextInt();
        System.out.println("Enter how many liters of gasoline you have used?");
        int liters = scanner.nextInt();
        double distance = (liters * 100.0) / km;
        System.out.println("Results is: "+ distance);
    }
}
