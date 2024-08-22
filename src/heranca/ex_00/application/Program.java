package heranca.ex_00.application;

import heranca.ex_00.entities.Account;
import heranca.ex_00.entities.BusinessAccount;
import heranca.ex_00.entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new SavingsAccount(1004, "Ana", 1000.0, 0.01);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        sc.close();

    }
}
