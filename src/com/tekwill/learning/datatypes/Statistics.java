package com.tekwill.learning.datatypes;

public class Statistics {
    long curentWorldPopulation = 7831436009L;
    double worldPopulation = 1.05;
    String source1 = "World Population Prospect the 219 Revision";
    String source2 = "International Programs Center at the U.S. Census Bureau, Population Division";
    String source3 = "is currently (2020) growing at a rate of around ";
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        System.out.println("Current World Population: " +statistics.curentWorldPopulation);
        System.out.println("World Population:\n • "+statistics.source3 +statistics.worldPopulation+"% per year.");
        System.out.println("Sources for the world population counter:\n • "+statistics.source1);
        System.out. println(" • "+statistics.source2);
    }

}