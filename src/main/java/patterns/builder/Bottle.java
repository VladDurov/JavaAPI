package patterns.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return (Bottle.class.getName());
    }
}
