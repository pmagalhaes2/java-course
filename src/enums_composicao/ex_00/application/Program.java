package enums_composicao.ex_00.application;

import enums_composicao.ex_00.entities.Order;
import enums_composicao.ex_00.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order.toString());

    }
}
