package patterns.builder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return (VegBurger.class.getName());
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
