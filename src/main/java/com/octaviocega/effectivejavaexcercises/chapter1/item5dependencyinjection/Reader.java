package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item5dependencyinjection;

public class Reader {

    // Not implementing injection. Hardcoding a single book
    // private final Book book = Book.withContent("Not implementing injection");

    private final Book book;

    // Injecting the book instead of hardcoding one
    public Reader(Book book){
        this.book = book;
    }

    public void read(){
        System.out.println(book.getContent());
    }
}
