package patterns.builder;

public class MealBuilder {

    public Meal getVegMeal(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal getNonVegMeal(){
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new Pepsi());
        return nonVegMeal;
    }

}
