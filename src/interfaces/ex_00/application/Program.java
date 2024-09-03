package interfaces.ex_00.application;

import interfaces.ex_00.entities.CarRental;
import interfaces.ex_00.entities.Vehicle;
import interfaces.ex_00.model.services.BrazilTaxService;
import interfaces.ex_00.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental carRental = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
