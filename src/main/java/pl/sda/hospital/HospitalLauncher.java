package pl.sda.hospital;

import java.util.Scanner;

public class HospitalLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        Hospital hospital = new Hospital();
        int counter = 0;
        counter++;

        while (on) {
            System.out.println("0 ABY WYSC, 1 ABY DODAC, 2 ABY WYSWIETLIC");
            String choice;
            switch (choice = sc.nextLine()) {
                case "1": {

                    System.out.println("Podaj imię :");
                    String name = sc.nextLine();

                    System.out.println("Podaj Nazwisko :");
                    String surname = sc.nextLine();

                    System.out.println("Podaj PESEL ");
                    String pesel = sc.nextLine();

                    System.out.println("Podaj wiek :");
                    int age = sc.nextInt();
                    sc.nextLine();


                    Patient patient = new Patient(name, surname, pesel, age);
                    hospital.addPatient(patient);
                    break;

                }
                case "2": {
                    hospital.showTable(hospital.getPatients());
                    break;
                }

                case "0": {
                    on = false;
                }

                //METODY ZBIERANIA DANYCH OD UŻYTKOWNIKA
                // Z KLAWIATURY, NASTEPNIE METODA KTORA PRZYPISUJE JE SETTERAMI LUB KONSTRUKTOREM


            }

        }
    }
}
