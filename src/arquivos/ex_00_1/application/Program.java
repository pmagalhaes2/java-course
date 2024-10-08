package arquivos.ex_00_1.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String srcPath = sc.nextLine();

        File path = new File(srcPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");
        for(File folder: folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file: files) {
            System.out.println(file);
        }

        sc.close();
    }
}
