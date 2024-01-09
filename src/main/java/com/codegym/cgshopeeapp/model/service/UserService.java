package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.entity.User;

public class UserService {
    private static UserService instance;
    private UserService(){}

    public static UserService getInstance() {
        if(instance == null){
            instance = new UserService();
        }
        return instance;
    }

    public String changePW(String oldPW, String newPW, String againPW, User user){
        if(!(oldPW.equals(user.getPassword()))) return "Sai mật khẩu cũ";
        if(!(newPW).equals(againPW)) return "Nhập lại mật khẩu cũ không chính xác";
        user.setPassword(newPW);
        UserDao.update(user);
        return "Đổi mật khẩu thành công";
    }

    public String changePN(String oldPN, String newPN, String againPN, User user){
        if(!(oldPN.equals(user.getPhoneNumber()))) return "SĐT cũ không chính xác";
        if(!(newPN).equals(againPN)) return "Nhập lại SĐT không chính xác";
        user.setPassword(newPN);
        UserDao.update(user);
        return "Đổi SĐT thành công";
    }
}
