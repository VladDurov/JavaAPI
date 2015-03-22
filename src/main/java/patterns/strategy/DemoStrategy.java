package patterns.strategy;

public class DemoStrategy {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("Add:" + context.executeStrategy(15,10));
        context = new Context(new Substract());
        System.out.println("Substract:" + context.executeStrategy(15, 10));
    }
}
