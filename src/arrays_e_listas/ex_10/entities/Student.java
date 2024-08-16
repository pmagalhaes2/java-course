package arrays_e_listas.ex_10.entities;

public class Student {
    private String name;
    private double a;
    private double b;

    public Student(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public boolean checkIsApproved() {
        return (a + b) / 2.0 >= 6.0;
    }
}
