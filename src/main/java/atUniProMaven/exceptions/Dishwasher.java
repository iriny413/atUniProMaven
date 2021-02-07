package atUniProMaven.exceptions;

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

    private int numberOfDishes;
    private int maximumNumber;
    private boolean isDishwasherWorking;
    private boolean isDishwasherEmpty;
    private boolean isCleanDishInside;

    public Dishwasher(int numberOfDishes, int maximumNumber, boolean isDishwasherWorking, boolean isDishwasherEmpty, boolean isCleanDishInside) {
        this.numberOfDishes = numberOfDishes;
        this.isDishwasherWorking = isDishwasherWorking;
        this.isDishwasherEmpty = isDishwasherEmpty;
        this.isCleanDishInside = isCleanDishInside;
        this.maximumNumber = maximumNumber;

        if(numberOfDishes > maximumNumber) {
            throw new IllegalArgumentException("Maximum number of dishes is exceeded");
        }

        if(maximumNumber <= 0) {
            throw new IllegalArgumentException("Maximum number of dishes can not be 0 or less than 0");
        }

        if(numberOfDishes <= 0) {
            throw new IllegalArgumentException("Number of inserted dishes can not be 0 or less than 0");
        }
    }


    /**
     * This method is used to insert dishes (one by one) into the dishwasher;
     * It's impossible to insert dishes if the dishwasher is working or if the clean dishes are inside the dishwasher;
     * It's impossible to insert the number of dishes that exceeds the maximum number of allowed dishes;
     */
    public void insertDishes() {
        if(! isDishwasherWorking) {
            if(isDishwasherEmpty) {
                int counter = 0;
                for(int i = 1; i < maximumNumber; i++) {
                    counter += counter;
                }
                System.out.println("SUCCESS: All dishes (number = " + counter + ") have been inserted");
            } else {
                System.out.println("FAILURE: Dishwasher is not empty");
            }
        } else {
            System.out.println("FAILURE: Dishwasher is already in use");
        }
    }

    /**
     * This method is used to take dishes out of the dishwasher;
     */
    public void takeDishesOut() {
        System.out.println("SUCCESS: dishes have been taken out");
    }

    /**
     * This method is used to start the dishwasher
     * Impossible to start the dishwasher if clean dishes are inside it or if it is working or empty;
     */
    public void startDishwasher() {
        if(! isDishwasherEmpty) {
            if(! isCleanDishInside) {
                if(! isDishwasherWorking) {
                    System.out.println("SUCCESS: Dishwasher has been started");
                } else {
                    System.out.println("FAILURE: Dishwasher is working");
                }
            } else {
                System.out.println("FAILURE: Clean dishes are inside of the dishwasher");
            }
        } else {
            System.out.println("FAILURE: Dishwasher is empty");
        }
    }

    /**
     * This method is used to stop the dishwasher;
     * Impossible to stop the dishwasher if it is working;
     */
    public void stopDishwasher() {
        if(! isDishwasherWorking) {
            System.out.println("SUCCESS: Dishwasher has been stopped");
        } else {
            System.out.println("FAILURE: Dishwasher is not running");
        }
    }
}
