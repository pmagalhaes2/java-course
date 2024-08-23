package tratamento_excecoes.ex_01.application;

import tratamento_excecoes.ex_01.exceptions.DomainException;
import tratamento_excecoes.ex_01.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            sc.nextLine();
            Date checkin = sdf.parse(sc.nextLine());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.nextLine());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.nextLine());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.nextLine());

            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        } finally {
            sc.close();
        }
    }
}
