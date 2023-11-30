package model.entity;

import model.enums.OrderStatus;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private OrderStatus orderStatus;
    private Client sender;
    private Client recipient;

    public Order(Integer id, LocalDateTime createdDate, LocalDateTime updatedDate, OrderStatus orderStatus, Client sender, Client recipient) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.orderStatus = orderStatus;
        this.sender = sender;
        this.recipient = recipient;
    }
    public Order( LocalDateTime createdDate, LocalDateTime updatedDate, OrderStatus orderStatus, Client sender, Client recipient) {
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.orderStatus = orderStatus;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public Client getRecipient() {
        return recipient;
    }

    public void setRecipient(Client recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", orderStatus=" + orderStatus +
                ", sender=" + sender +
                ", recipient=" + recipient +
                '}';
    }
}
