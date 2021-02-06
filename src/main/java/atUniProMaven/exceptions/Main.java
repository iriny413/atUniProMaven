package atUniProMaven.exceptions;

public class Main {
    public static void main(String[] args) {

        // Dishwasher(int numberOfDishes, int maxNumber, boolean isDWworking, boolean isDWempty, boolean cleanDishesInside)
        final Dishwasher dishwasher1 = new Dishwasher(30, 40, false, true, false);
        //final Dishwasher dishwasher2 = new Dishwasher(0, 50, false, false, false);
        //final Dishwasher dishwasher3 = new Dishwasher(-3, 10, false, true, false);

        dishwasher1.stopDishwasher();
        dishwasher1.takeDishesOut();
        dishwasher1.insertDishes();
        dishwasher1.startDishwasher();

    }
}
