package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item5dependencyinjection;


public class Book {

    private String content;

    private Book(String content){
        this.content = content;
    }

    public static Book withContent(String content){
        return new Book(content);
    }

    public String getContent(){
        return content;
    }
}
