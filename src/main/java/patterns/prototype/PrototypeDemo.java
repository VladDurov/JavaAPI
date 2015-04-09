package patterns.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();


        for(int i=1; i<3; i++) {
            Shape clonedShape = ShapeCache.getShape("" + i);
            clonedShape.draw();
        }


        //проверка


    }

}
