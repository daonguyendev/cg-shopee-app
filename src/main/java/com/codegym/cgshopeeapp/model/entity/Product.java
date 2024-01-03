package com.codegym.cgshopeeapp.model.entity;

public class Product {
    private int id;
    private String idUser;
    private String name;
    private int originUnitPrice;
    private int promote;
    private int currentPrice;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, int originUnitPrice, int promote, int currentPrice, int quantity) {
        this.id = id;
        this.name = name;
        this.originUnitPrice = originUnitPrice;
        this.promote = promote;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
    }

    public Product(int id, String idUser, String name, int originUnitPrice, int promote, int currentPrice, int quantity) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.originUnitPrice = originUnitPrice;
        this.promote = promote;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOriginUnitPrice() {
        return originUnitPrice;
    }

    public void setOriginUnitPrice(int originUnitPrice) {
        this.originUnitPrice = originUnitPrice;
    }

    public int getPromote() {
        return promote;
    }

    public void setPromote(int promote) {
        this.promote = promote;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idUser='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", originUnitPrice=" + originUnitPrice +
                ", promote=" + promote +
                ", currentPrice=" + currentPrice +
                ", quantity=" + quantity +
                '}';
    }
}

