package com.tekwill.learning.datatypes;

public class Constants {
    byte zero = 0;
    byte one = 1;
    byte imaginaryUnit = -1;
    char ju = 178;
    char golden = 248;
    double PI = 3.141592653589793238462643;
    double e = 2.718281828459045235360287;
    double square = 1.414213562373095048801688;
    final double GOLDEN_RATIO =  1.61803398874989484820;

    public static void main(String[] args){
        Constants constants = new Constants();
        System.out.println("• "+constants.zero +"(zero).");
        System.out.println("• "+constants.one +"(one),the natural number after zero.");
        System.out.println("• ℼ(pi), the constant representing the ratio of a circle's circumference to its diameter, approximately equal to "+constants.PI);
        System.out.println("• \uD835\uDD22,approximately equal to "+constants.e);
        System.out.println("• \uD835\uDD26,the imaginary unit such that \uD835\uDD26"+constants.ju + "="+constants.imaginaryUnit);
        System.out.println("• √2(square root of 2), the length of the diagonal of a square with unit sides, approximately equal to "+constants.square);
        System.out.println("• "+constants.golden+"(golden ratio), approximately equal to "+constants.GOLDEN_RATIO+",or algebraiclly,1+√5 " +
                " \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t‾‾‾‾‾‾.\n" +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2 " );
        }
}
