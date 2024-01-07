package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.entity.Cart;
import com.codegym.cgshopeeapp.model.entity.Product;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.service.CartService;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PaymentController", value = "/payment")
public class PaymentController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Cart cart = (Cart) httpSession.getAttribute("cart");
        List<Product> list = cart.getProductArrayList();
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            int quantity = Integer.parseInt(request.getParameter(String.valueOf(product.getId())));
            product.setQuantity(quantity);
        }
        User user = (User) httpSession.getAttribute("user");
        message = CartService.getInstance().payMent(cart,user);
        httpSession.setAttribute("cart",cart);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/home");
        request.setAttribute("message",message);
        request.setAttribute("a","home");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}