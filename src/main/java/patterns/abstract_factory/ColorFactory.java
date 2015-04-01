package patterns.abstract_factory;

import patterns.factory.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if(color==null)return null;

        if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if(color.equalsIgnoreCase("creen")){
            return new Green();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
