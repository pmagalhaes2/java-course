package poo.student.entities;

public class Student {
    public String name;
    public double a;
    public double b;
    public double c;

    public double calculateAverage() {
        return a + b + c;
    }

    public String returnStatus() {
        double average = calculateAverage();
        if (average < 60.00) {
            return String.format("FAILED%nMISSING %.2f POINTS", 60.00 - average);
        } else {
            return "PASS";
        }
    }
}
