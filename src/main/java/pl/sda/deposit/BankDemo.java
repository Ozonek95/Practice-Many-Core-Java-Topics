package pl.sda.deposit;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        BankDeposit bank = new BankDeposit();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę całkowitą na koncie :");
        bank.setTotalAmount(scanner.nextDouble());
        System.out.println("Podaj czas trwania lokaty w dniach :");
        bank.setDuration(scanner.nextInt());
        System.out.println("Podaj oprocentowanie :");
        bank.setPercentage(scanner.nextDouble());

        System.out.println("Twoje konto po zakończeniu lokaty będzie zasilone kwotą :"+bank.calculate(bank.getTotalAmount(),bank.getDuration(),bank.getPercentage()));
    }
}
