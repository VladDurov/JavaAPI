package basic;

public abstract class Car implements Playing{

    protected CarModels model;

    public CarModels getModel() {
        return model;
    }

    public abstract boolean startEngine();

    public void stopEngine(){
        System.out.println("stop engine!");
    };

}




