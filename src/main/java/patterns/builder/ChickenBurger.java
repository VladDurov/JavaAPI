package patterns.builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return (ChickenBurger.class.getName());
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
