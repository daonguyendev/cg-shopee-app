package com.codegym.cgshopeeapp.model.entity;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> productArrayList;
    private int totalBill;

    public Cart() {
    }

    public ArrayList <Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList <Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
