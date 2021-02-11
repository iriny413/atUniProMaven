package atUniProMaven.exceptions;

public enum Status {

    WORKING("is working now"),
    NOT_WORKING("is not working now"),
    EMPTY("is empty"),
    CLEAN_DISHES_INSIDE("contains clean dishes"),
    DIRTY_DISHES_INSIDE("contains dirty dishes");

    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
