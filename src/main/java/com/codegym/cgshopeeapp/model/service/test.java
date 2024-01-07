package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.entity.Product;

public class test {
    public static void main(String[] args) {
        for (String x: ProductDao.getCategory()
             ) {
            System.out.println(x);
        }
    }
}

