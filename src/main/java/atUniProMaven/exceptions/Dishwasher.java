package atUniProMaven.exceptions;

import java.util.Arrays;

/**
 * Задание:
 * Создать класс Dishwasher, который моделирует работу посудомоечной машины. Вы можете:
 * a.  загружать посуду по одному элементу (нельзя, если машина запущена либо чистая посуда не выгружена);
 * загрузить посуду можно, если позволяет вместимость
 * (задается в конструктуре и определяет макс кол-во загруженной посуды);
 * b.  достать всю посуду;
 * c.  запустить машину (нельзя, если машина пустая либо чистая посуда не выгружена, либо уже запущена);
 * d.  остановить работу машины (нельзя, если не запущена);
 * Добавьте эксепшены в программу для обработки некорректного пользования машинкой (например, нельзя добавить посуду,
 * если машина уже запущена) - используйте свои классы для эксепшенов.
 * В конструктуре входной параметр должен быть больше 0 - используйте стандартный эксепшн, подходящий по назначению.
 * К методам должны быть добавлены java docs с описанием метода, входных параметров, результата и возможных эксепшенов
 */

public class Dishwasher {

    private int maximumNumber;
    private Status status = Status.EMPTY;
    private DishType[] dishes;
    private int counter;

    public Dishwasher(int maximumNumber) {
        if(maximumNumber <= 0) {
            throw new IllegalArgumentException("Maximum number of dishes can not be 0 or less than 0");
        }
        this.maximumNumber = maximumNumber;

        dishes = new DishType[maximumNumber];
    }

    /**
     * This method is used to insert one dish into the dishwasher;
     * It's impossible to insert a dish if the dishwasher is working
     * or if the clean dishes are inside the dishwasher;
     * It's impossible to insert the number of dishes that exceeds the maximum number of allowed dishes;
     */
    public void insertDishes(DishType currentDishType) throws DishwasherException {
        if(status == Status.WORKING || status == Status.CLEAN_DISHES_INSIDE) {
            throw new DishwasherException("FAILURE: Impossible to insert dishes because the dishwasher " + status.getName());
        }
        if(counter >= maximumNumber) {
            throw new IndexOutOfBoundsException("Maximum number of dishes (" + maximumNumber + ") is exceeded");
        }
        dishes[counter] = currentDishType;
        counter += 1;

        System.out.println("SUCCESS: Dish has been inserted - " + dishes[counter - 1] +
                ". The total number of inserted dishes is " + (counter));

        status = Status.NOT_WORKING;
        System.out.println("STATUS: Dishwasher " + status.getName());
    }

    /**
     * This method is used to take dishes out of the dishwasher;
     * It's impossible to take dishes out if the dishwasher is working or empty
     */
    public DishType[] takeDishesOut() {
        if(status == Status.WORKING || status == Status.EMPTY) {
            throw new DishwasherException("FAILURE: Impossible to take dishes out because the dishwasher " + status.getName());
        }
        if(counter == 0) {
            throw new DishwasherException("FAILURE: Impossible to take dishes out - the dishwasher " + Status.EMPTY.getName());
        }
        System.out.println("SUCCESS: Dishes have been taken out " + Arrays.toString(dishes));

        status = Status.EMPTY;
        System.out.println("STATUS: Dishwasher " + status.getName());
        counter = 0;
        return dishes;
    }

    /**
     * This method is used to start the dishwasher
     * Impossible to start the dishwasher if clean dishes are inside of it or if it's working or it's empty;
     */
    public void startDishwasher() throws DishwasherException {
        if(status == Status.EMPTY || status == Status.CLEAN_DISHES_INSIDE || status == Status.WORKING) {
            throw new DishwasherException("FAILURE: Impossible to start the dishwasher because it " + status.getName());
        }
        System.out.println("SUCCESS: Dishwasher has been started");

        status = Status.WORKING;
        System.out.println("STATUS: Dishwasher " + status.getName());
    }

    /**
     * This method is used to stop the dishwasher;
     * Impossible to stop the dishwasher if it is working;
     */
    public void stopDishwasher() throws DishwasherException {
        if(status == Status.NOT_WORKING || status == Status.EMPTY) {
            throw new DishwasherException("FAILURE: Impossible to stop the dishwasher because it " + status.getName());
        }
        System.out.println("SUCCESS: Dishwasher has been stopped");

        status = Status.CLEAN_DISHES_INSIDE;
        System.out.println("STATUS: Dishwasher " + status.getName());
    }
}
