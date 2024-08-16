import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Idade: ");
        Number age = sc.nextInt();

        sc.close();

        System.out.printf("Nome: %s - Idade: %d", name, age);

    }
}