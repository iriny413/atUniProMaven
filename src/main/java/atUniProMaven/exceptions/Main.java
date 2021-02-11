package atUniProMaven.exceptions;

public class Main {
    public static void main(String[] args) throws DishwasherException {

        final Dishwasher dishwasher1 = new Dishwasher(3);

        dishwasher1.insertDishes(DishType.CUP, 0);
        dishwasher1.insertDishes(DishType.PLATE, 1);
        dishwasher1.insertDishes(DishType.SPOON, 2);

        dishwasher1.startDishwasher();

        dishwasher1.stopDishwasher();
        dishwasher1.takeDishesOut();

    }
}
