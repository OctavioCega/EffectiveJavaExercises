package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item5dependencyinjection;

public class Main {

    public static void main(String[] args){
        Book book = Book.withContent("Hello this is a book");

        Reader reader = new Reader(book);

        reader.read();

        /*
         * In summary, do not use a singleton or static utility class to implement a class
         * that depends on one or more underlying resources whose behavior affects that of
         * the class, and do not have the class create these resources directly.
         */
    }
}
