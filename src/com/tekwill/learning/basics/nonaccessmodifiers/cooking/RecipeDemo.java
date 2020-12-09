package com.tekwill.learning.basics.nonaccessmodifiers.cooking;
import static com.tekwill.learning.basics.nonaccessmodifiers.cooking.Recipe.*;
import static com.tekwill.learning.basics.nonaccessmodifiers.cooking.Recipe.sourceUrl;
public class RecipeDemo {
    public static void main(String[] args){
        Recipe r1 = new Recipe("omleta", "oua");
        Recipe r2 = new Recipe("torta", "blaturi");
        sourceUrl = "www.bucate.md";
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(sourceUrl);
        r2.Update();
        markAsCooked();
    }
}