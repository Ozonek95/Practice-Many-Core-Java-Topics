package pl.sda.collections;

import java.util.*;

public class CountryApp {
    public static void main(String[] args) {
        List<Country> listOfCountries = CountryApp.initialize();
        Map<String, Country> mapOfCountries = CountryApp.getMap(listOfCountries);
        Set<Map.Entry<String, Country>> mapEntries = mapOfCountries.entrySet();
        for (Map.Entry<String, Country> entry : mapEntries) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getName());
        }

    }


    public static List<Country> initialize() {
        List<Country> countries = new LinkedList<>();
        countries.add(new Country("England", "London"));
        countries.add(new Country("Poland", "Warsaw"));
        countries.add(new Country("Germany", "Berlin"));
        countries.add(new Country("Monako", "Monako"));
        countries.add(new Country("Italy", "Roma"));
        return countries;
    }

    private static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> mapsOfCountries = new HashMap<>();
        for (Country aList : list) {
            mapsOfCountries.put(aList.getCapital(), aList);
        }
        return mapsOfCountries;

    }
}
