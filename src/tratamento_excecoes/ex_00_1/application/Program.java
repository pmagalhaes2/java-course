package tratamento_excecoes.ex_00_1.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\temp\\int.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Error opening file: %s\n", e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
