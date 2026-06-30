package application.menu.entities;

import application.menu.enums.OrderStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class Order {

    private Table table;
    private int numberOfOrder;
    private LocalDateTime receivedAt;
    private OrderStatus orderStatus;
    private int numberOfPeople;
    private List<MenuItem> itemsOrdered;
    private double totalPrice;

}
