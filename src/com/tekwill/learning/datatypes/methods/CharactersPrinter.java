package com.tekwill.learning.datatypes.methods;

public class CharactersPrinter {
    public static void printerChars(char ch1, char ch2, int numberPerlineToDisplay){
         int numberOfCharacters = 0;
         for (char ch = ch1; ch <=ch2; ch++){
             ++numberOfCharacters;
             System.out.print(ch + " ");
            if (numberOfCharacters % numberPerlineToDisplay == 0) {
            System.out.println();
            }
         }
    }
}

