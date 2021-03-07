package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item4enforcenoninstantiability;

// Final to prevent extending
public final class Util {

    // To prevent instantiation
    private Util(){}

    public static void hello(){
        System.out.println("Hello from util class");
    }
}
