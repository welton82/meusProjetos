package application;

import entities.OrderStatus;
import entities.enuns.Order;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

    }
}
