package patterns.builder;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return (Pepsi.class.getName());
    }

    @Override
    public float price() {
        return 7.8f;
    }
}
