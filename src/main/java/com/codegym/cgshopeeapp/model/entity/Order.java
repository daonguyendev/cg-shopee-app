package com.codegym.cgshopeeapp.model.entity;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private String userEmail;
    private int productID;
    private String productName;
    private int quantity;
    private int totalPrice;

    private LocalDateTime dateTime;
    public Order() {
    }
    public Order(int id, String userEmail, int productID, String productName, int quantity, int totalPrice, LocalDateTime dateTime) {
        this.id = id;
        this.userEmail = userEmail;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", userEmail='" + userEmail + '\'' +
                ", productID=" + productID +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", dateTime=" + dateTime +
                '}';
    }
}
