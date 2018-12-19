package pl.sda.regular_expressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correctName = false;
        boolean correctSurname = false;
        boolean correctEmail = false;
        boolean correctPassword = false;
        String name;
        String surname;
        String email;
        String password;
        while (!correctName) {
            System.out.println("Podaj imię");
            name = sc.nextLine();
            correctName = nameValid(name);
            if(!correctName){
                System.out.println("Nieprawidłowo, spróbuj ponownie");
            }

        }
        while (!correctSurname) {
            System.out.println("Podaj nazwisko");
            surname = sc.nextLine();
            correctSurname = surnameValid(surname);
            if(!correctSurname){
                System.out.println("Nieprawidłowo, spróbuj ponownie");
            }

        }
        while (!correctEmail) {
            System.out.println("Podaj email");
            email = sc.nextLine();
            correctEmail = emailValid(email);
            if(!correctEmail){
                System.out.println("Nieprawidłowo, spróbuj ponownie");
            }

        }
        while (!correctPassword) {
            System.out.println("Podaj hasło");
            password = sc.nextLine();
            correctPassword = passwordValid(password);
            if(!correctPassword){
                System.out.println("Nieprawidłowo, spróbuj ponownie");
            }

        }





    }

    public static boolean nameValid(String string) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        return pattern.matcher(string).matches();

    }

    public static boolean surnameValid(String string) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}(-[A-Z][a-z]+)?");
        return pattern.matcher(string).matches();

    }

    public static boolean emailValid(String string) {
        Pattern pattern = Pattern.compile("\\w+@\\w+(\\.pl|\\.com)");
        return pattern.matcher(string).matches();

    }

    public static boolean passwordValid(String string) {
        Pattern pattern = Pattern.compile(".+[@#$].*");
        return pattern.matcher(string).matches();

    }
}
