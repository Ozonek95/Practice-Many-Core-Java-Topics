package pl.sda.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String IP = sc.nextLine();
        if (ifCorrectIP(IP)) {
            System.out.println("Your IP is correct!");
        } else {
            System.out.println("Incorrect IP adress");
        }
    }

    public static boolean ifCorrectIP(String string) {

        Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        return pattern.matcher(string).matches();
    }
}





