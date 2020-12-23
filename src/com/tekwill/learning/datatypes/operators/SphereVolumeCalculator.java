package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class SphereVolumeCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius for a sphere volume calculation : ");
        int radius = scanner.nextInt();

         //aproximative metod double sphereVolume = 4.0/3.00 * 3.14 * (radius * radius * radius);

        double sphereVolume = 4.0/3.0 * Math.PI * Math.pow(radius,3);
        System.out.printf("Sphere volume = %.3f", sphereVolume);
    }

}


