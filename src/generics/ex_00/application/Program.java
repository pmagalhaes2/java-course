package generics.ex_00.application;

import generics.ex_00.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int choice = sc.nextInt();

        for (int i = 0; i < choice ; i++) {
            int n = sc.nextInt();
            ps.addValue(n);
        }

        ps.print();

        System.out.println("First: " + ps.first());

        sc.close();
    }
}
