package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.log.Log;
import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", urlPatterns = {"", "/home"})
public class HomeController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Product> products = ProductDao.get6Product();
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/home/home.jsp");

        try {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/home/home.jsp");
            request.setAttribute("a", "home");
            request.setAttribute("products",products);
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
        String a = request.getParameter("a");

    }

    public void destroy() {
    }

}
