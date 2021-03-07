package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item2hierarchicalbuilder;

import java.util.EnumSet;
import java.util.Set;

public abstract class Vehicle {
    public enum Feature {AC, ABS, RADIO, AIRBAGS}
    final Set<Feature> features;

    // This builder is a generic type with a recursive type parameter
    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Feature> features = EnumSet.noneOf(Feature.class);
        public T addFeature(Feature feature){
            features.add(feature);
            return self();
        }

        // Must override to return new instance
        abstract Vehicle build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Vehicle(Builder<?> builder){
        features = builder.features.clone();
    }
}
