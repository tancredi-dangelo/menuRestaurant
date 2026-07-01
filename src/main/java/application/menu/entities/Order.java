package application.menu.entities;

import application.menu.enums.OrderStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private Table table;
    private int numberOfOrder;
    private LocalDateTime receivedAt;
    private OrderStatus orderStatus;
    private int numberOfPeople;
    private List<MenuItem> itemsOrdered;
    private double totalPrice;

    // constructor
    public Order(Table table, int numberOfOrder, int numberOfPeople, List<MenuItem> itemsOrdered) {
        this.table = table;
        this.numberOfOrder = numberOfOrder;
        this.numberOfPeople = numberOfPeople;
        this.itemsOrdered = itemsOrdered;

        this.receivedAt = LocalDateTime.now();
        this.orderStatus = OrderStatus.RECEIVED;

        double count = 0;
        for (MenuItem item : this.itemsOrdered) { count += item.getPrice(); }
        this.totalPrice = count;
    }


    // getters

    public Table getTable() {
        return table;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public LocalDateTime getReceivedAt() {
        return receivedAt;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public List<MenuItem> getItemsOrdered() {
        return itemsOrdered;
    }

    public double getTotalPrice() {
        return totalPrice;
    }



    // setters

    public void setTable(Table table) {
        this.table = table;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public void setReceivedAt(LocalDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setItemsOrdered(List<MenuItem> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }



    // methods

    // add an item

    //


}
