package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item2hierarchicalbuilder;

public class Main {

    public static void main(String[] args){

        // Using builder from the Ford class and using also
        // from Vehicle class
        Vehicle vehicle = new Ford.Builder(1000)
                .addFeature(Vehicle.Feature.ABS)
                .addFeature(Vehicle.Feature.AIRBAGS)
                .build();

    }

}
