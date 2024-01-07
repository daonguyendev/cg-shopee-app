package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.dao.WalletDao;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.entity.Wallet;
import com.codegym.cgshopeeapp.model.util.Email;
import com.codegym.cgshopeeapp.model.util.RandomCode;

public class SignUpService {
    private static SignUpService signUpService;
    private SignUpService(){

    }

    public static SignUpService getInstance(){
        if (signUpService==null){
            signUpService = new SignUpService();
        }
        return signUpService;
    }
    public boolean signup(String email, String password){
        boolean isExist = UserDao.findByEmail(email);
        if (!isExist){
            String code = RandomCode.getRandomCode();
            User user = new User(email,password,code,false);
            UserDao.insert(user);
            Email.getInstance().sendEmail(email,code);
            Wallet wallet = new Wallet(email);
            WalletDao.insert(wallet);
            return true;
        } else {
            return false;
        }
    }
}
