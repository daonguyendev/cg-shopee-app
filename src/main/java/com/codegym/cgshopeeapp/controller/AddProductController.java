package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.entity.Cart;
import com.codegym.cgshopeeapp.model.entity.Product;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AddProductController", value = "/add")
public class AddProductController extends HttpServlet {
    private String message;
    public void init() {
        message = "Hello World!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession();
        Cart cart = (Cart) httpSession.getAttribute("cart");
        int id = Integer.parseInt(request.getParameter("id"));
        boolean isValid = true;
        for (Product item : cart.getProductArrayList()){
            if (item.getId() == id){
                isValid = false;
            }
        }
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/home");
        if (isValid) {
            Product product = ProductDao.getById(id);
            cart.getProductArrayList().add(product);
            message = "Đã thêm sản phẩm thành công";
        }
        else {
            message = "Sản phẩm đã có trong giỏ hàng";
        }
        request.setAttribute("message",message);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }
    public void destroy() {
    }
}