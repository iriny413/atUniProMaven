package atUniProMaven.exceptions;

public class CleanDishesInsideException extends Exception {

    public CleanDishesInsideException() {
        super();
        System.out.println("FAILURE: Clean dishes are inside of the dishwasher");
    }

    public CleanDishesInsideException(String s) {
        super(s);
        System.out.println("FAILURE: Clean dishes are inside of the dishwasher");
    }
}
