package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.UserDao;

public class VerifyService {
    private static VerifyService verifyService;
    private VerifyService(){

    }
    public static VerifyService getInstance(){
        if (verifyService==null){
            verifyService = new VerifyService();
        }
        return verifyService;
    }

    public boolean verify(String email, String code){
        boolean isValid = UserDao.findByEmailAndCode(email,code);
        if (isValid){
            UserDao.activeStatusByEmail(email);
            return true;
        }
        else {
            return false;
        }
    }
}
