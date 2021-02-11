package atUniProMaven.exceptions;

public class Main {
    public static void main(String[] args) throws DishwasherException {

        final Dishwasher dishwasher1 = new Dishwasher(3);

        dishwasher1.stopDishwasher();

        dishwasher1.insertDishes(DishType.CUP);
        dishwasher1.insertDishes(DishType.PLATE);
        dishwasher1.insertDishes(DishType.SPOON);

        dishwasher1.startDishwasher();

        dishwasher1.stopDishwasher();
        dishwasher1.takeDishesOut();
        dishwasher1.takeDishesOut();
    }
}
