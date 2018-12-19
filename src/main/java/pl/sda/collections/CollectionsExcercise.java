package pl.sda.collections;

import java.util.*;

public class CollectionsExcercise {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(5);
        listOfIntegers.add(5);
        listOfIntegers.add(7);
        listOfIntegers.add(9);
        listOfIntegers.add(9);
        listOfIntegers.add(12);
        System.out.println(CollectionsExcercise.getSorted(listOfIntegers));
    }
    public static <T> List<T> getSorted(List<T> list){
        Set<T> sortedSet = new TreeSet<>(list);
        return new LinkedList<>(sortedSet);
    }
}
