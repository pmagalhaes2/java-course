package generics.ex_00_2.application;

import generics.ex_00_2.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "maria2@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
