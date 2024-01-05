package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.entity.User;

import java.io.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UserController", urlPatterns = {"/user"})
public class UserController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/view/content/user-information.jsp");
        try {
            User user= (User) request.getSession().getAttribute("user");
            String sdt = user.getPhoneNumber().charAt(user.getPhoneNumber().length()-2)+user.getPhoneNumber().charAt(user.getPhoneNumber().length()-1)+"";
            request.setAttribute("sdt", sdt);
            request.setAttribute("a","ui");
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("oldPW");
        String email = req.getParameter("Email");
        String newPW = req.getParameter("newPW");
        User user = UserDao.get(email,password);
        user.setPassword(newPW);
        UserDao.update(user);
        User user1 = (User) req.getSession().getAttribute("user");
        user1.setPassword(newPW);
    }

    public void destroy() {
    }
}