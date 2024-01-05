package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.UserDao;

public class test {
    public static void main(String[] args) {
        UserDao.findByEmail("annguyen@gmail.com");
    }
}
