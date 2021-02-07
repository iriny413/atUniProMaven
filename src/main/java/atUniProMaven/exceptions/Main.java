package atUniProMaven.exceptions;

public class Main {
    public static void main(String[] args) {

        final Dishwasher dishwasher1 = new Dishwasher(30, 41);

        dishwasher1.stopDishwasher(false);
        dishwasher1.stopDishwasher(true);
        dishwasher1.takeDishesOut();
        dishwasher1.insertDishes(false, false);
        dishwasher1.insertDishes(true, true);
        dishwasher1.insertDishes(true, false);
        dishwasher1.insertDishes(false, true);
        dishwasher1.startDishwasher(false, false, true);

    }
}
