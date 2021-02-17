package atUniProMaven.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Создайте класс с 2 полями, который будет использоваться при работе с коллекциями(н-р, класс User с полями age, name).
 * <p>
 * 1.  Реализовать метод, который принимает на вход 2 листа и возвращает лист,
 * состоящий только из тех элементов, которые присутствуют в обоих листах.
 * 2.  Задание из 1го пункта, но вместо List нужно использовать Set.
 * <p>
 * 3.  Создайте ArrayList с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
 * выводя на консоль информацию в виде: <индекс>: <элемент>
 * <p>
 * 4.  Создайте HashSet с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
 * выводя на консоль информацию в виде: <элемент>
 * <p>
 * 5.  Создайте HashMap с несколькими элементами (используя дубликаты) и проитерируйтесь по нему,
 * выводя на консоль информацию в виде:
 * a.  итерация по значениям: <значение>
 * b.  итерация по ключам: <ключ>: <значение>
 * c.  итерация по парам: <ключ>: <значение>
 */

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof User)) return false;

        User user = (User) o;

        if(age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    /**
     * This method is to compare 2 lists and to return a new list with the objects that are common in both lists
     *
     * @param list1 - the first list
     * @param list2 - the second list
     * @return a list of objects that are common for list 1 & list 2
     */
    public static List<User> commonList(List<User> list1, List<User> list2) {

        List<User> list3 = new ArrayList<User>();
        for(User e1 : list1) {
//            for(User e2 : list2) {
            if(list2.contains(e1)) {
                System.out.println("Common user of the list: " + e1);
                list3.add(e1);
            }
        }
        return list3;
    }

    /**
     * This method is to compare 2 sets and to return a new set with the objects that are common in both sets
     *
     * @param set1 - the first set
     * @param set2 - the second set
     * @return a list of objects that are common for set 1 & set 2
     */
    public static Set<User> commonSet(Set<User> set1, Set<User> set2) {

        Set<User> set3 = new HashSet<User>();
        for(User e1 : set1) {
            if(set2.contains(e1)) {
                System.out.println("Common user of the set: " + e1);
                set3.add(e1);
            }
        }
        return set3;
    }
}
