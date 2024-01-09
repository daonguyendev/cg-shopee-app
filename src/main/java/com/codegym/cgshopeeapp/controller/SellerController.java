package com.codegym.cgshopeeapp.controller;

import java.io.*;

import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.entity.User;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SellerController", urlPatterns = {"/seller","/seller/register"})
public class SellerController extends HttpServlet {
    private String message;

    public void init() {
        message = "";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getServletPath();
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("user");
        if (user.getRole().equals("Shop")){
            response.sendRedirect("/product");
        } else {
            switch (action) {
                case "/seller":
                    request.setAttribute("a", "seller");
                    RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/seller-register-form.jsp");
                    try {
                        requestDispatcher.forward(request, response);
                    } catch (ServletException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "/seller/register":
                    user.setRole("Shop");
                    UserDao.update(user);
                    httpSession.setAttribute("user", user);
                    response.sendRedirect("/product");
                    break;
            }
        }
    }

    public void destroy() {
    }
}