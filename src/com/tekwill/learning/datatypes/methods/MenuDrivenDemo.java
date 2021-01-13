package com.tekwill.learning.datatypes.methods;

import java.util.Scanner;

public class MenuDrivenDemo {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean letterSelected = true;
        System.out.println("Please enter one of the following choices: ");
        System.out.println("c)  carnivore            p) pianist ");
        System.out.println("t)  tree                 g) game");

        do {
            String letter = scanner.nextLine();
            if ((letter.toLowerCase().equals("c")) || (letter.toLowerCase().equals("p")) || (letter.toLowerCase().equals("t")) || (letter.toLowerCase().equals("g"))) {
                MenuDriven.showRespons(letter);
                letterSelected = false;
            } else {
                System.out.println("Please enter c,p,t or g ");
            }

        } while (letterSelected);
    }
}
