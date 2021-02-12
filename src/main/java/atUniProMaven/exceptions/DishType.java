package atUniProMaven.exceptions;

public enum DishType {
    SPOON("spoon"),
    PLATE("plate"),
    CUP("cup");


    private String name;

    DishType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DishType{" +
                "name='" + name + '\'' +
                '}';
    }
}
