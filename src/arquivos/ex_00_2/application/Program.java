package arquivos.ex_00_2.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path:");
        String srcPath = sc.nextLine();

        File path = new File(srcPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());

        sc.close();
    }
}
