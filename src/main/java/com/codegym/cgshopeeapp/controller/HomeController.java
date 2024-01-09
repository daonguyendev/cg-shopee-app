package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.log.Log;
import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.dao.WalletDao;
import com.codegym.cgshopeeapp.model.entity.Product;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.entity.Wallet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", urlPatterns = {"", "/home","/home/search"})
public class HomeController extends HttpServlet {
    private String message;

    public void init() {
        message = "";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getServletPath();
        switch (action){
            case "/home":
                List<Product> products = ProductDao.get6Product();
                HttpSession httpSession = request.getSession();
                User user = (User) httpSession.getAttribute("user");
                if (user!=null){
                    int money = WalletDao.getById(user.getEmail()).getMoney();
                    httpSession.setAttribute("money",money);
                }
                try {
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/home/home.jsp");
                    message = request.getParameter("message");
                    if (message!=null){
                        request.setAttribute("message",message);
                    }
                    request.setAttribute("a", "home");
                    request.setAttribute("products",products);
                    dispatcher.forward(request, response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "/home/search":
                try {
                String name = request.getParameter("searchBar");
                List<Product> productList = ProductDao.getByName(name);
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/home/home.jsp");
                message = request.getParameter("message");
                if (message!=null){
                    request.setAttribute("message",message);
                }
                request.setAttribute("a", "home");
                request.setAttribute("products",productList);
                dispatcher.forward(request, response);
                break;
            } catch (ServletException e) {
            throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = ProductDao.get6Product();
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("user");
        if (user!=null){
            int money = WalletDao.getById(user.getEmail()).getMoney();
            httpSession.setAttribute("money",money);
        }
        try {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/home/home.jsp");
            message = request.getParameter("message");
            if (message!=null){
                request.setAttribute("message",message);
            }
            request.setAttribute("a", "home");
            request.setAttribute("products",products);
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}
