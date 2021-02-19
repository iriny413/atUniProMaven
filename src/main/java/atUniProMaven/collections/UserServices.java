package atUniProMaven.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserServices {
    /**
     * This method is to compare 2 lists and to return a new list with the objects that are common in both lists
     *
     * @param list1 - the first list
     * @param list2 - the second list
     * @return a list of objects that are common for list 1 & list 2
     */
    public static List<User> commonList(List<User> list1, List<User> list2) {

        List<User> commonElements = new ArrayList<User>();
        for(User e1 : list1) {
            if(list2.contains(e1)) {
                System.out.println("Common user of the list: " + e1);
                commonElements.add(e1);
            }
        }
        return commonElements;
    }

    /**
     * This method is to compare 2 sets and to return a new set with the objects that are common in both sets
     *
     * @param set1 - the first set
     * @param set2 - the second set
     * @return a list of objects that are common for set 1 & set 2
     */
    public static Set<User> commonSet(Set<User> set1, Set<User> set2) {

        Set<User> commonElements = new HashSet<User>();
        for(User e1 : set1) {
            if(set2.contains(e1)) {
                System.out.println("Common user of the set: " + e1);
                commonElements.add(e1);
            }
        }
        return commonElements;
    }
}
