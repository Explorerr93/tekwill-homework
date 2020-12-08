package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;
import static com.tekwill.learning.basics.nonaccessmodifiers.kingdom.Knight.guild;
public class KnightDemo {
    public static void main(String[] args){
        Knight k1 = new Knight(34, "Maximus");
        Knight k2 = new Knight(31, "Achilles");
        Knight k3 = new Knight(45,"Alexander");
        guild = "TheDarkKnights";
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(Knight.guild);
        k2.fight();
        Knight.invokeMagic();
    }
}