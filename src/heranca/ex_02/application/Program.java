package heranca.ex_02.application;

import heranca.ex_02.entities.Circle;
import heranca.ex_02.entities.Rectangle;
import heranca.ex_02.entities.Shape;
import heranca.ex_02.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data:\n", i + 1);
            System.out.print("Rectangle or Circle (r/c)? ");
            sc.nextLine();
            char opt = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();

            if (opt == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapes.add(new Rectangle(Color.valueOf(color), width, height));
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(Color.valueOf(color), radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape s : shapes) {
            System.out.printf("%.2f%n", s.area());
        }

        sc.close();

    }
}
