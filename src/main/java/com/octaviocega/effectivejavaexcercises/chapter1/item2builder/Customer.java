package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item2builder;

public class Customer {

    // Required
    private final String name;
    private final String lastname;
    private final int age;

    // Optional
    private final String address;
    private final String cellphone;
    private final String email;
    private final String landline;

    // Builder pattern.
    public static class Builder {
        // Required
        private final String name;
        private final String lastname;
        private final int age;

        // Optional
        private String address;
        private String cellphone;
        private String email;
        private String landline;

        public Builder(String name, String lastname, int age){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder cellphone(String cellphone){
            this.cellphone = cellphone;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder landline(String landline){
            this.landline = landline;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

    private Customer(Builder builder){
        name = builder.name;
        lastname = builder.lastname;
        age = builder.age;
        address = builder.address;
        cellphone = builder.cellphone;
        email = builder.email;
        landline = builder.landline;
    }
}
