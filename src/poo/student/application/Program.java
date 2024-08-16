package poo.student.application;

import poo.student.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        sc.nextLine();
        student.name = sc.nextLine();
        student.a = sc.nextDouble();
        student.b = sc.nextDouble();
        student.c = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", student.calculateAverage());
        System.out.println(student.returnStatus());

        sc.close();
    }
}
