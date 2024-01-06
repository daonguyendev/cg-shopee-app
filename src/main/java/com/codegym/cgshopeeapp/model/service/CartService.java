package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.WalletDao;
import com.codegym.cgshopeeapp.model.entity.Cart;
import com.codegym.cgshopeeapp.model.entity.Product;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.entity.Wallet;

import java.util.List;

public class CartService {
    private static CartService cartService;
    private CartService(){

    }
    public static CartService getInstance(){
        if (cartService==null){
            cartService = new CartService();
        }
        return cartService;
    }

    public String payMent(Cart cart, User user){
        int totalMoney = 0;
        List<Product> list = cart.getProductArrayList();
        for (Product product : list) {
            totalMoney += product.getCurrentPrice() * product.getQuantity();
        }
        Wallet walletBuyer = WalletDao.getById(user.getEmail());
        if (walletBuyer.getMoney() >= totalMoney){
            for (Product product : list) {
                int itemMoney = product.getCurrentPrice() * product.getQuantity();
                walletBuyer.setMoney(walletBuyer.getMoney()-itemMoney);
                Wallet walletSeller = WalletDao.getById(product.getIdUser());
                walletSeller.setMoney(walletSeller.getMoney()+itemMoney);
            }
            cart.getProductArrayList().clear();
            return "Thanh toán thành công";
        }else {
            return "Số tiền trong ví không đủ để thanh toán";
        }
    }
}
