package atUniProMaven.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Создайте класс с 2 полями, который будет использоваться при работе с коллекциями(н-р, класс User с полями age, name).
 * <p>
 * 1.  Реализовать метод, который принимает на вход 2 листа и возвращает лист,
 * состоящий только из тех элементов, которые присутствуют в обоих листах.
 * 2.  Задание из 1го пункта, но вместо List нужно использовать Set.
 * 3.  Создайте ArrayList с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
 * выводя на консоль информацию в виде: <индекс>: <элемент>
 * 4.  Создайте HashSet с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
 * выводя на консоль информацию в виде: <элемент>
 * 5.  Создайте HashMap с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
 * выводя на консоль информацию в виде:
 * a.  итерация по значениям: <значение>
 * b.  итерация по ключам: <ключ>: <значение>
 * c.  итерация по парам: <ключ>: <значение>
 */

public class Main {

    public static void main(String[] args) {
        UserServices userServices = new UserServices();

        User user1 = new User("Ivanov", 20);
        User user2 = new User("Petrov", 19);
        User user3 = new User("Sidorov", 21);
        User user4 = new User("Ivanov", 20);

        List<User> list1 = new ArrayList<User>();
        list1.add(user1);
        list1.add(user2);
        System.out.println("This is the list #1: " + list1);

        List<User> list2 = new ArrayList<User>();
        list2.add(user3);
        list2.add(user4);
        System.out.println("This is the list #2: " + list2);

        List<User> listCommon = userServices.commonList(list1, list2);
        System.out.println("The common list: " + listCommon);

        Set<User> set1 = new HashSet<User>();
        set1.add(user1);
        set1.add(user2);
        Set<User> set2 = new HashSet<User>();
        set2.add(user3);
        set2.add(user4);

        Set<User> setCommon = userServices.commonSet(set1, set2);
        System.out.println("The common set: " + setCommon);

        /**
         * 3.  Создайте ArrayList с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
         * выводя на консоль информацию в виде: <индекс>: <элемент>
         */
        List<User> arr = new ArrayList<User>();
        arr.add(user1);
        arr.add(user2);
        arr.add(user2);
        arr.add(user4);

        System.out.println("ArrayList with duplicated users");
        for(int i = 0; i < arr.size(); i++) {
            User user = arr.get(i);
            System.out.println(i + ": " + user);
        }

        /**
         * 4. Создайте HashSet с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
         * выводя на консоль информацию в виде: <элемент>
         */
        Set<User> set = new HashSet<User>();
        set.add(user1);
        set.add(user2);
        set.add(user2);
        set.add(user4);

        System.out.println("HashSet with duplicated users");
        for(User user : set) {
            System.out.println(user);
        }

        /**
         * 5.  Создайте HashMap с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
         *  выводя на консоль информацию в виде:
         *   a.  итерация по значениям: <значение>
         *   b.  итерация по ключам: <ключ>: <значение>
         *   c.  итерация по парам: <ключ>: <значение>
         */
        Map<Integer, User> map = new HashMap<Integer, User>();
        map.put(1, user1);
        map.put(2, user2);
        map.put(3, user2);
        map.put(4, user4);

        System.out.println("HashMap with duplicated users");

        //a.  итерация по значениям: <значение>
        System.out.println("A: iterate by values");
        for(User value : map.values()) {
            System.out.println("User = " + value);
        }
        System.out.println();


        //B: итерация по ключам: <ключ>: <значение>
        System.out.println("A: iterate by key");
        for(Integer key : map.keySet()) {
            System.out.println("ID = " + key + ", User = " + map.get(key));
        }
        System.out.println();

        //C: итерация по парам: <ключ>: <значение>
        System.out.println("A: iterate by pairs: key - value");
        for(Map.Entry<Integer, User> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}


