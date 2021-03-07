package main.java.com.octaviocega.effectivejavaexcercises.chapter1.item2hierarchicalbuilder;

public class Ford extends Vehicle{
    public final int hp;

    public static class Builder extends Vehicle.Builder<Builder>{
        private final int hp;

        public Builder(int hp){
            this.hp = hp;
        }

        @Override
        Vehicle build() {
            return new Ford(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Ford(Builder builder){
        super(builder);
        hp = builder.hp;
    }
}
