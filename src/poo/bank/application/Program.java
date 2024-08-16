package poo.bank.application;

import poo.bank.util.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char choice = sc.next().charAt(0);

        double initialDepositValue = 0.0;

        if (choice == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDepositValue = sc.nextDouble();
        }

        Account account = new Account(accountNumber, accountHolder, initialDepositValue);

        System.out.println("Account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n\n", accountNumber, accountHolder,
                initialDepositValue);

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n\n", account.getAccountNumber(),
                account.getAccountHolder(),
                account.getBalance());

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n\n", account.getAccountNumber(),
                account.getAccountHolder(),
                account.getBalance());

        sc.close();
    }
}
