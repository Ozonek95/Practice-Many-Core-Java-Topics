package pl.sda.hospital_polimorphism;

import java.util.Arrays;

public class Hospital {
    private static final int SIZE_OF_HOSPITAL = 5;
    private static Person[] employers;
    private static int numberOfEmployers;

    public Hospital() {
        employers = new Person[SIZE_OF_HOSPITAL];
        numberOfEmployers = 0;
    }

    public static void add(Person person) {
        if (numberOfEmployers < SIZE_OF_HOSPITAL) {
            employers[numberOfEmployers] = person;
            numberOfEmployers++;
        } else {
            System.out.println("Brak etatów");
        }
    }

    @Override
    public String toString() {

        return Arrays.toString(employers);
    }
}

