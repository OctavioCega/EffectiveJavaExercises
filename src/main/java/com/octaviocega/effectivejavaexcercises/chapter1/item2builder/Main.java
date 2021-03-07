package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item2builder;

public class Main {

    public static void main(String[] args){
        // Notice that customer can not be created using a constructor
        //Customer customer = new Customer();

        // Customer object will always have its required fields set
        Customer customer = new Customer.Builder("John", "Doe", 27)
                .cellphone("9999999999").build();

        // Important to notice that once created, customer fields can not be changed.
    }
}
