package patterns.builder;

public class Wrapper implements Packing{

    @Override
    public String pack() {
        return (Wrapper.class.getName());
    }
}
