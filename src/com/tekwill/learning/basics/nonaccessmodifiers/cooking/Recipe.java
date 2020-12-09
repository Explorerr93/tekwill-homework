package com.tekwill.learning.basics.nonaccessmodifiers.cooking;

public class Recipe {
    public String title;
    public String description;
    static String sourceUrl;
    public static void markAsCooked() {
        System.out.println("Cooooked");
    }
        public Recipe (String title, String description) {
            this.title = title;
            this.description = description;
        }
        public void Update() {
        System.out.println("Updating");
    }
         @Override
        public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
