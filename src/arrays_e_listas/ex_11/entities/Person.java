package arrays_e_listas.ex_11.entities;

public class Person {
    private char genre;
    private double height;

    public Person(char genre, double height) {
        this.genre = genre;
        this.height = height;
    }

    public char getGenre() {
        return genre;
    }

    public double getHeight() {
        return height;
    }
}
