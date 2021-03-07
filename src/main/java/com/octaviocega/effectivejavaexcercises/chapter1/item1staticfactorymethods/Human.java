package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item1staticfactorymethods;

public class Human {

    private String name;

    // This should be private so clients only use the static factory method
    public Human(String name){
        this.name = name;
    }

    // This is the static factory method.
    public static Human withName(String name){
        return new Human(name);
    }

    public String getName(){
        return name;
    }

}
