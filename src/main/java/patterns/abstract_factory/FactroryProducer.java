package patterns.abstract_factory;

import patterns.factory.ShapeFactory;

public class FactroryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }

}
