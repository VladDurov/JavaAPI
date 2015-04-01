package patterns.abstract_factory;

import patterns.factory.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
