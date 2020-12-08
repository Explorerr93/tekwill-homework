package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;
public class Knight {
    public int age;
    public String nickname;
    static String guild;
    public void fight(){
        System.out.println("Fight");
    }
    public static void invokeMagic(){
        System.out.println("Maaaaaagic");
    }

    public Knight(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "age=" + age +
                " years, nickname='" + nickname + '\'' +
                '}';
    }
}