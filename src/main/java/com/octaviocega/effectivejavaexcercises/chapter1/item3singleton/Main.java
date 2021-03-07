package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item3singleton;

public class Main {

    public static void main(String[] args){
        SingletonApproach1.INSTANCE.hello();
        SingletonApproach2.getInstance().hello();
        SingletonApproach3.INSTANCE.hello();
    }
}
