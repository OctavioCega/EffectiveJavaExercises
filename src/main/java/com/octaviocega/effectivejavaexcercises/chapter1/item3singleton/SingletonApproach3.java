package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item3singleton;

// Often the best way to implement singleton
public enum SingletonApproach3 {
    INSTANCE;

    public void hello(){
        System.out.println("Hello from singleton 3");
    }
}
