package patterns.factory;

public class ShapeFactory {

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
