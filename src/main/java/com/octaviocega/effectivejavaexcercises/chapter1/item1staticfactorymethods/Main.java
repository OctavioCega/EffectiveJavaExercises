package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item1staticfactorymethods;

public class Main {

    public static void main(String[] args){

        // Example using constructor
        Human human1 = new Human("John");

        // Using static factory method. This is meaningful and preferable.
        Human human2 = Human.withName("Doe");

        System.out.println("Created with constructor: " + human1.getName());
        System.out.println("Created with static factory method: " + human2.getName());
    }

}
