package atUniProMaven.exceptions;

public class DishwasherWorkingException extends Exception {

    public DishwasherWorkingException() {
        super();
        System.out.println("FAILURE: Dishwasher is working");
    }

    public DishwasherWorkingException(String s) {
        super(s);
        System.out.println("FAILURE: Dishwasher is working");
    }
}
