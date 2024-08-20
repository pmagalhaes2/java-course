package enums_composicao.ex_01.application;

import enums_composicao.ex_01.entities.Department;
import enums_composicao.ex_01.entities.HourContract;
import enums_composicao.ex_01.entities.Worker;
import enums_composicao.ex_01.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, department);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data:\n", i + 1);
            System.out.print("Date (DD/MM/YYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract hourContract = new HourContract(date, value, duration);
            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String month_year = sc.next();
        int month = Integer.parseInt(month_year.substring(0, 2));
        int year = Integer.parseInt(month_year.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", month_year, worker.income(month, year));

        sc.close();
    }
}
