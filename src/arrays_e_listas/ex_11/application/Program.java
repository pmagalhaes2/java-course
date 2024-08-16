package arrays_e_listas.ex_11.application;

import arrays_e_listas.ex_11.entities.Person;

import java.util.Locale;
import java.util.Scanner;

// Problema "dados_pessoas"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        double sumWomansHeight = 0.0;
        int womansQuantity = 0;

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            sc.nextLine();
            char genre = sc.nextLine().charAt(0);
            persons[i] = new Person(genre, height);
            if (genre == 'f' || genre == 'F') {
                sumWomansHeight += height;
                womansQuantity++;
            }
        }

        double minHeight = persons[0].getHeight();
        double maxHeight = persons[0].getHeight();
        for (Person person : persons) {
            double currentHeight = person.getHeight();
            if (currentHeight < minHeight) {
                minHeight = currentHeight;
            }
            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
            }
        }

        System.out.printf("Menor altura = %.2f\n", minHeight);
        System.out.printf("Maior altura = %.2f\n", maxHeight);

        if (womansQuantity > 0) {
            System.out.printf("Media das alturas das mulheres = %.2f\n", sumWomansHeight / womansQuantity);
        } else {
            System.out.println("Nao ha mulheres cadastradas.");
        }

        System.out.printf("Numero de homens = %d", persons.length - womansQuantity);

        sc.close();
    }
}
