package atUniProMaven.exceptions;

public class Main {
    public static void main(String[] args) throws DishwasherException {

        final Dishwasher dishwasher1 = new Dishwasher(3);

        dishwasher1.stopDishwasher();
        dishwasher1.takeDishesOut();

        dishwasher1.insertDishes();
        dishwasher1.insertDishes();
        dishwasher1.insertDishes();

        dishwasher1.startDishwasher();
    }
}
