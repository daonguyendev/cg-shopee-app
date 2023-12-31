package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.UserDao;

public class SignInService {
    private static SignInService instance;

    private SignInService() {
    }

    ;

    public static SignInService getInstance() {
        if (instance == null) {
            instance = new SignInService();
        }
        return instance;
    }

    public boolean login(String email, String password) {

        if (UserDao.findByEmailAndPassword(email, password)) {

            if (UserDao.getByEmailAndPassword(email, password).isStatus()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean loginCheckIsStatus(String email, String password) {
        if (UserDao.findByEmailAndPassword(email, password) && UserDao.getByEmailAndPassword(email, password).isStatus()) {
            return true;
        } else {
            return false;
        }
    }

    public String number;

    public void check(String email, String password) {
        if (UserDao.findByEmailAndPassword(email, password) && UserDao.getByEmailAndPassword(email, password).isStatus()) {
            number = "1";
        } else {
            if (!UserDao.findByEmailAndPassword(email, password)) {
                number = "2";

            } else if (UserDao.findByEmailAndPassword(email, password) && !UserDao.getByEmailAndPassword(email, password).isStatus()) {
                number = "3";
            }
        }
    }

}


