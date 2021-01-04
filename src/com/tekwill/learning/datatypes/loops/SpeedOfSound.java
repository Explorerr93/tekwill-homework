package com.tekwill.learning.datatypes.loops;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one next power>> \"air\", \"water\" or \"steel)\"");
        String power= scanner.nextLine();
        System.out.println("Enter the distance that the sound wave will travel:");
        double distance = scanner.nextDouble();
        switch (power){
            case "air" :
                System.out.printf("Sound will travel in the %s %.3f seconds", power, (distance / 1100));
                break;
            case "water" :
                System.out.printf("Sound will travel in the %s %.3f seconds", power, (distance / 4900));
                break;
            case "steel" :
                System.out.printf("Sound will travel in the %s %.3f seconds", power, (distance / 16400));
                break;
            default :
                System.out.println("You have entered a wrong medium");
                break;
        }
    }
}