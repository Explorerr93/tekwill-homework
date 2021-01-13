package com.tekwill.learning.datatypes.methods;

import java.util.Scanner;

public class MenuDriven {
    public static void showRespons(String letter) {
        switch (letter.toLowerCase()) {
            case "c":
                System.out.println("The lion is a carnivore animal.");
                break;
            case "p":
                System.out.println("Samir Golescu is a famous pianist.");
                break;
            case "t":
                System.out.println("A maple is a tree.");
                break;
            case "g":
                System.out.println("Max Payne - is the best game.");
                break;
        }
    }
}
