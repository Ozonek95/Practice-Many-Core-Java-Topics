package pl.sda.lambda_and_stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountryApp {
    public static void main(String[] args) {
        List<Country> listOfCountry = Arrays.asList(
                new Country("Poland", "Warsaw"),
                new Country("Germany", "Berlin"),
                new Country("Spain", "Madrit"),
                new Country("Croatia", "Zagreb"),
                new Country("Slovakia", "Bratislava")
        );
        List<Country> listOfCountryBeginWithB = listOfCountry.stream()
                .filter(country -> country.getCapital().charAt(0) == 'B')
                .collect(Collectors.toList());
        listOfCountryBeginWithB.forEach(country -> System.out.println(country.getCapital()));

        List<Country> listOfCountryWith$ = listOfCountry.stream()
                .map(Country::copy)
                .peek(country -> country.setCapital("$" + country.getCapital() + "$")).collect(Collectors.toList());
        listOfCountryWith$.forEach(country -> System.out.println(country.getCapital()));

        Set<Country> countrySet = new HashSet<>(listOfCountry);

        countrySet.forEach(country -> System.out.println(country.getCapital()));




    }
}
