package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item3singleton;

public class SingletonApproach2 {

    private SingletonApproach2(){}

    private static final SingletonApproach2 INSTANCE = new SingletonApproach2();

    public static SingletonApproach2 getInstance(){
        return INSTANCE;
    }

    public void hello(){
        System.out.println("Hello from singleton 2");
    }
}
