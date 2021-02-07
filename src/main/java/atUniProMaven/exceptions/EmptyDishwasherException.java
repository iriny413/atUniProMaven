package atUniProMaven.exceptions;

public class EmptyDishwasherException extends Exception {
    public EmptyDishwasherException() {
        super();
        System.out.println("FAILURE: Dishwasher is empty");
    }

    public EmptyDishwasherException(String s) {
        super(s);
        System.out.println("FAILURE: Dishwasher is empty");
    }

}
