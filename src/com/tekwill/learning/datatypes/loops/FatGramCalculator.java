package com.tekwill.learning.datatypes.loops;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the number of calories in a food intem: ");
        Scanner scanner = new Scanner(System.in);
        int calories = scanner.nextInt();
        System.out.println("and fat grams in a food intem: ");
        int fatGrams = scanner.nextInt();
        int caloriesfromfat = fatGrams * 9;
        int percentageCalories = caloriesfromfat % calories;

        System.out.println("The percentage of the calories that come from fat is " + percentageCalories);
        if (percentageCalories < 30){
            System.out.println("The food is low in fat.");
        }

    }
}
