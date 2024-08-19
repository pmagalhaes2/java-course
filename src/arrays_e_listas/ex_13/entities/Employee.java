package arrays_e_listas.ex_13.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increase(double percentage) {
        this.salary *= 1.0 + percentage / 100;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
    }
}
