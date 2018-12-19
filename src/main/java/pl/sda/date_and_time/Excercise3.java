package pl.sda.date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) throws BadDatesOrder {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first date");
        String dateOne = scanner.nextLine();
        System.out.println("Give second date");
        String dateTwo = scanner.nextLine();
        LocalDate randomDate = getRandomDateInRange(dateOne, dateTwo);
        System.out.println(randomDate);

    }

    public static LocalDate getRandomDateInRange(String minDate, String maxDate) throws BadDatesOrder {

        LocalDate localDate1 = LocalDate.parse(minDate);
        LocalDate localDate2 = LocalDate.parse(maxDate);
        if (localDate1.isAfter(localDate2)) {
            throw new BadDatesOrder("Bad order! Choose Your dates again");
        }

        long days = ChronoUnit.DAYS.between(localDate1, localDate2);

        Random random = new Random();

        int randomDays = random.nextInt((int)days);

        return localDate1.plusDays(randomDays);


    }
}
