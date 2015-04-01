package patterns.factory;

import patterns.abstract_factory.AbstractFactory;
import patterns.abstract_factory.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String typeShape){

        if(typeShape==null)return null;

        if(typeShape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(typeShape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }

}
