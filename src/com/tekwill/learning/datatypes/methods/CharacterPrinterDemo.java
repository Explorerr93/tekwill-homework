package com.tekwill.learning.datatypes.methods;

public class CharacterPrinterDemo {
    public static void main (String[] args){

        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerline = 10;
        System.out.println("Characters from 1 to Z are:");
        CharactersPrinter.printerChars(ch1, ch2, numberPerline);
    }
}
