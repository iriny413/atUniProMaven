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
    private boolean areCleanDishesInside;

    public Dishwasher(int numberOfDishes, int maximumNumber, boolean isDishwasherWorking, boolean areCleanDishInside, boolean isDishwasherEmpty) {
        this.numberOfDishes = numberOfDishes;
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

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }

    public int getMaximumNumber() {
        return maximumNumber;
    }

    public void setMaximumNumber(int maximumNumber) {
        this.maximumNumber = maximumNumber;
    }

    public boolean isDishwasherWorking() {
        return isDishwasherWorking;
    }

    public void setDishwasherWorking(boolean dishwasherWorking) {
        isDishwasherWorking = dishwasherWorking;
    }

    public boolean isDishwasherEmpty() {
        return isDishwasherEmpty;
    }

    public void setDishwasherEmpty(boolean dishwasherEmpty) {
        isDishwasherEmpty = dishwasherEmpty;
    }

    public boolean isAreCleanDishInside() {
        return areCleanDishesInside;
    }

    public void setAreCleanDishInside(boolean areCleanDishInside) {
        this.areCleanDishesInside = areCleanDishInside;
    }

    /**
     * This method is used to insert dishes (one by one) into the dishwasher;
     * It's impossible to insert dishes if the dishwasher is working or if the clean dishes are inside the dishwasher;
     * It's impossible to insert the number of dishes that exceeds the maximum number of allowed dishes;
     */
    public void insertDishes() throws CleanDishesInsideException,
            DishwasherWorkingException {
        if(! isDishwasherWorking) {
            if(! areCleanDishesInside) {
                int counter = 0;
                for(int i = 1; i <= numberOfDishes; i++) {
                    try {
                        counter += 1;
                    } catch(ArithmeticException e) {
                        e.printStackTrace();
                    }
                    System.out.println("SUCCESS: Dish (number is " + counter + ") has been inserted");
                }
                System.out.println("SUCCESS: All required dishes (number is " + counter + ") have been inserted");
            }
            throw new CleanDishesInsideException();
        }
        throw new DishwasherWorkingException();
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
     * <p>
     * //         * @param isDishwasherWorking - true if dishwasher is working, false if it is not working
     * //         * @param isDishwasherEmpty   - true if dishwasher is empty, false if it is not empty
     * //         * @param isCleanDishInside   - true if clean dishes inside the dishwasher, false if no clean dishes are inside it
     */
    public void startDishwasher()
            throws DishwasherWorkingException, CleanDishesInsideException, EmptyDishwasherException {
        if(! isDishwasherEmpty) {
            if(! areCleanDishesInside) {
                if(! isDishwasherWorking) {
                    System.out.println("SUCCESS: Dishwasher has been started");
                } else {
                    throw new DishwasherWorkingException();
                }
            } else {
                throw new CleanDishesInsideException();
            }
        } else {
            throw new EmptyDishwasherException();
        }
    }


    /**
     * This method is used to stop the dishwasher;
     * Impossible to stop the dishwasher if it is working;
     */
    public void stopDishwasher() throws DishwasherWorkingException {
        if(! isDishwasherWorking) {
            System.out.println("SUCCESS: Dishwasher has been stopped");
        } else {
            throw new DishwasherWorkingException();
        }
    }
}
