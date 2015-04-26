package patterns.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape shape = new Circle();
        shape.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

    }
}
