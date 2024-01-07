package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.entity.Cart;
import com.codegym.cgshopeeapp.model.entity.Product;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "DeleteProductController", value = "/delete")
public class DeleteProductController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession();
        Cart cart = (Cart) httpSession.getAttribute("cart");
        List<Product> list = cart.getProductArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == Integer.parseInt(request.getParameter("id"))){
                list.remove(list.get(i));
            }
        }

        httpSession.setAttribute("cart",cart);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/cart");
        try {
            request.setAttribute("a","cart");
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}