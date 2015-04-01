package patterns.builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return (Coke.class.getName());
    }

    @Override
    public float price() {
        return 9.2f;
    }
}
