package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class EquivalentTime {
    public static final int SECONDS_IN_ONE_DAY = 86400;
    public static final int SECONDS_IN_ONE_HOUR = 3600;
    public static final int SECONDS_IN_A_MINUTE = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        long totalSeconds = scanner.nextLong();
        long days = totalSeconds / SECONDS_IN_ONE_DAY;
        long restFromDays = totalSeconds % SECONDS_IN_ONE_DAY;
        long hours = restFromDays / SECONDS_IN_ONE_HOUR;
        long restFromHours = restFromDays % SECONDS_IN_ONE_HOUR;
        long minutes = restFromHours / SECONDS_IN_A_MINUTE;
        long restSeconds = restFromHours % SECONDS_IN_A_MINUTE;
        System.out.println(totalSeconds + " seconds = " + days + " days, " + hours + " hours, " + minutes + " minutes, " + restSeconds + " seconds.");
    }
}

