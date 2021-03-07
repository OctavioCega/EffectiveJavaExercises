package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item3singleton;

public class SingletonApproach1 {

    // Called only once
    private SingletonApproach1(){}


    public static final SingletonApproach1 INSTANCE = new SingletonApproach1();

    public void hello(){
        System.out.println("Hello from singleton 1");
    }
}
