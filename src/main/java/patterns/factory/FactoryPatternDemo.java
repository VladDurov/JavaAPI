package patterns.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape rectangle = sf.getShape("rectangle");
        rectangle.draw();

        Shape circle = sf.getShape("circle");
        circle.draw();

    }

}
