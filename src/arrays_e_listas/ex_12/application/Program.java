package arrays_e_listas.ex_12.application;

import arrays_e_listas.ex_12.entities.Rent;

import java.util.Scanner;

// Problema "pensionato"
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] rents = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d\n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rents[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (Rent rent: rents) {
            if (rent != null) {
                System.out.printf("%d: %s, %s\n", rent.getRoom(), rent.getName(), rent.getEmail());
            }
        }

        sc.close();
    }
}
