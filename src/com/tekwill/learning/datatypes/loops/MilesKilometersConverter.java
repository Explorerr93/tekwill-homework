package com.tekwill.learning.datatypes.loops;

public class MilesKilometersConverter {
    public static final double KILOMETERS_IN_A_MILE = 1.609;

    public static void main(String[] args) {
        System.out.println("Miles   Kilometers");
        for (int mile = 1; mile <= 10; mile++) {
            System.out.printf("\n%3d       %.3f", mile, (mile * KILOMETERS_IN_A_MILE));
        }

    }
}

