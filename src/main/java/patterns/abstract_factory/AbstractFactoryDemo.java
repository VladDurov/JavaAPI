package patterns.abstract_factory;

import patterns.factory.Shape;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactroryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactroryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();

    }

}
