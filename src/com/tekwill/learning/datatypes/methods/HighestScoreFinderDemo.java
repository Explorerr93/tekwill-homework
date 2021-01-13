package com.tekwill.learning.datatypes.methods;

import java.util.Scanner;
import static com.tekwill.learning.datatypes.methods.HighestScoreFinder.printBestStudent;
import static com.tekwill.learning.datatypes.methods.HighestScoreFinder.findBestStudent;

public class HighestScoreFinderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int studentsNumber = scanner.nextInt();

        for (int i = 1; i <= studentsNumber; i++) {
            findBestStudent();
        }
        printBestStudent();


    }
}
