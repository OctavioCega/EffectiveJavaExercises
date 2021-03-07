package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item6avoidcreatingunnecesaryobjects;

public class Main {

    public static void main(String[] args){

        // Creating unnecessary Long object each iteration
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Total time (ms): " + (System.currentTimeMillis() - start));

        // This is faster, using primitive
        long sum2 = 0L;
        start = System.currentTimeMillis();
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.println("Total time (ms): " + (System.currentTimeMillis() - start));

        // “Don’t create a new object when you should reuse an existing one”
    }

}
