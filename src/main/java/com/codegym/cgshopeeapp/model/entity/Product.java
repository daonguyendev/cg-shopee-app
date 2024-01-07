package com.codegym.cgshopeeapp.model.entity;

public class Product {
    private int id;
    private String idUser;
    private String name;
    private int originUnitPrice;
    private int promote;
    private int currentPrice;
    private int quantity;
    private String Url;
    private String category;

    public Product() {
    }

    public Product(String idUser, String name, int originUnitPrice, int currentPrice, int quantity, String url) {
        this.idUser = idUser;
        this.name = name;
        this.originUnitPrice = originUnitPrice;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.Url = url;
    }

    public Product(int id, String idUser, String name, int originUnitPrice, int promote, int currentPrice, int quantity, String url) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.originUnitPrice = originUnitPrice;
        this.promote = promote;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.Url = url;
    }

    public Product(int id, String idUser, String name, int originUnitPrice, int promote, int currentPrice, int quantity, String url, String category) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.originUnitPrice = originUnitPrice;
        this.promote = promote;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        Url = url;
        this.category = category;
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

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
                ", Url='" + Url + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

