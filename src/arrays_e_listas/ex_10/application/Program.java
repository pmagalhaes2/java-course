package arrays_e_listas.ex_10.application;

import arrays_e_listas.ex_10.entities.Student;

import java.util.Locale;
import java.util.Scanner;

// Problema "aprovados"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos aluno serao digitados? ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Digite nome, primeira nota e segunda nota do %do aluno: \n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            students[i] = new Student(name, a, b);
        }

        System.out.println("Alunos aprovados: ");
        for (Student student : students) {
            if (student.checkIsApproved()) {
                System.out.println(student.getName());
            }
        }

        sc.close();
    }
}
