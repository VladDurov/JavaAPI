package patterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.getVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.getNonVegMeal();
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());
    }


}
