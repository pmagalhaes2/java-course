package arrays_e_listas.ex_03.application;

import arrays_e_listas.ex_03.entities.Person;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Problema "alturas"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        double totalHeight = 0.0;
        ArrayList<Person> under16List = new ArrayList<>();

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            persons[i] = new Person(name, age, height);
            totalHeight += height;

            if (age < 16) {
                under16List.add(persons[i]);
            }
        }

        double averageHeight = totalHeight / persons.length;
        double percentageUnder16 = (double) under16List.size() / persons.length * 100;

        System.out.printf("Altura média: %.2f%n", averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentageUnder16);

        if (!under16List.isEmpty()) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (Person person : under16List) {
                System.out.println(person.getName());
            }
        }

        sc.close();
    }
}
