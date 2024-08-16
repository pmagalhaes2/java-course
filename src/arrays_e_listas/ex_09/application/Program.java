package arrays_e_listas.ex_09.application;

import arrays_e_listas.ex_09.entities.Person;

import java.util.Scanner;

// Problema "mais_velho"
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Dado da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            persons[i] = new Person(name, age);
        }

        Person oldest = persons[0];

        for (Person person : persons) {
            if (person.getAge() > oldest.getAge()) {
                oldest = person;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", oldest.getName());

        sc.close();
    }
}
