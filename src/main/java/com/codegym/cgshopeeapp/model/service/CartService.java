package com.codegym.cgshopeeapp.model.service;

import com.codegym.cgshopeeapp.model.dao.ProductDao;
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
        StringBuilder message = new StringBuilder();
        Wallet walletBuyer = WalletDao.getById(user.getEmail());
        if (walletBuyer.getMoney() >= totalMoney){
            for (Product product : list){
                Product productSeller = ProductDao.getById(product.getId());
                if (productSeller.getQuantity()<product.getQuantity()){
                    message.append("Sản phẩm").append(product.getName()).append("trong cửa hàng không đủ số lượng; ");
                }
            }
            if (! message.isEmpty()){
                return String.valueOf(message) ;
            }
            for (Product product : list) {
                Product productSeller = ProductDao.getById(product.getId());
                int itemMoney = product.getCurrentPrice() * product.getQuantity();
                walletBuyer.setMoney(walletBuyer.getMoney()-itemMoney);
                Wallet walletSeller = WalletDao.getById(product.getIdUser());
                walletSeller.setMoney(walletSeller.getMoney()+itemMoney);
                WalletDao.update(walletBuyer);
                WalletDao.update(walletSeller);
                productSeller.setQuantity(productSeller.getQuantity()-product.getQuantity());
                ProductDao.update(productSeller);

            }
                cart.getProductArrayList().clear();
                return "Thanh toán thành công";
        }else {
            return "Số tiền trong ví không đủ để thanh toán";
        }
    }
}
