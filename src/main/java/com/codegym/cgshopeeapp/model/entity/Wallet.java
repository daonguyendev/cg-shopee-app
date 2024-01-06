package com.codegym.cgshopeeapp.model.entity;

public class Wallet {
    private String idUser;
    private int money;

    public Wallet() {
    }
    public Wallet(String idUser) {
        this.idUser = idUser;
        this.money = 1000000;
    }
    public Wallet(String idUser, int money) {
        this.idUser = idUser;
        this.money = money;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
