package pl.sda.collections;

import java.util.*;

public class CollectionExcercise4 {
    public static void main(String[] args) {

        Map<Integer, Integer> map;
        List<Integer> listOfNumbers = CollectionExcercise4.initialize();
        map = CollectionExcercise4.MapOfIntegers(listOfNumbers);

        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();




    }

    public static List<Integer> initialize() {
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(20));
        }
        return list;
    }

    private static Map<Integer, Integer> MapOfIntegers(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer aList : list) {
            if (!map.containsKey(aList)) {
                map.put(aList, 1);
            } else {
                map.put(aList, (map.get(aList) + 1));
            }

        }
        return map;

    }


}


