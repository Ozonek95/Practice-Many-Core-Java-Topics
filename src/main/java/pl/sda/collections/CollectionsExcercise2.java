package pl.sda.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsExcercise2 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(2);
        list1.add(2);
        list1.add(7);
        list1.add(5);
        list1.add(18);

        //
        list2.add(1);
        list2.add(13);
        list2.add(5);
        list2.add(2);
        list2.add(7);
        list2.add(2);
        list2.add(5);
        list2.add(17);
        list2.add(2);

        Set<Integer> setOfSames = new HashSet<>();

        ifIsInBothLists(list1, list2, setOfSames);
        System.out.println(setOfSames);
        System.out.println(unique(list1, list2));


    }

    public static void ifIsInBothLists(List<Integer> list1, List<Integer> list2, Set<Integer> set) {
        List listToIterate = null;
        if (list1.size() > list2.size()) {
            listToIterate = list1;
        } else listToIterate = list2;

        for (int i = 0; i < listToIterate.size(); i++)
            if (list1.contains(list2.get(i))) {
                set.add(list2.get(i));
            }
    }

    public static <T> HashSet<T> unique(List<T> list1, List<T> list2) {
        HashSet<T> setToReturn = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!list2.contains(list1.get(i))) {
                setToReturn.add(list1.get(i));
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))) {
                setToReturn.add(list2.get(i));
            }
        }
        return setToReturn;

    }


}
