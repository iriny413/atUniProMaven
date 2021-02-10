package atUniProMaven.exceptions;

public class Main {
    public static void main(String[] args) throws DishwasherWorkingException, CleanDishesInsideException, EmptyDishwasherException {

        final Dishwasher dishwasher1 = new Dishwasher(30, 40, false, false, true);

        dishwasher1.insertDishes();

        dishwasher1.setDishwasherWorking(true);
        dishwasher1.insertDishes();

        dishwasher1.insertDishes();
        dishwasher1.insertDishes();

        dishwasher1.startDishwasher();

        dishwasher1.stopDishwasher();
        dishwasher1.stopDishwasher();

        dishwasher1.takeDishesOut();
    }
}
