package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.service.UserService;

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
        message = "";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/view/content/user-information.jsp");
        try {
            User user= (User) request.getSession().getAttribute("user");
            String sdt = "";
            if (user.getPhoneNumber()!=null){
            int lengt = user.getPhoneNumber().length();
            for(int i = lengt - 1; i >= lengt - 2; i--){
                sdt = (Character) user.getPhoneNumber().charAt(i) + sdt;
            }
            }
            request.setAttribute("sdt", sdt);
            request.setAttribute("a","ui");
            request.setAttribute("message", message);
            message = "";
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        User user = (User) req.getSession().getAttribute("user");
        switch (action){
            case "changePassword":
                String oldPW = req.getParameter("oldPW");
                String newPW = req.getParameter("newPW");
                String againPW = req.getParameter("newAgainPW");
                message = UserService.getInstance().changePW(oldPW, newPW, againPW, user);
                break;
            case "changePhoneNumber":
                String oldPN = req.getParameter("oldPN");
                String newPN = req.getParameter("newPN");
                String againPN = req.getParameter("newAgainPN");
                message = UserService.getInstance().changePW(oldPN, newPN, againPN, user);
                break;
            case "saveChange":
                String newName = req.getParameter("name");
                String newGender = req.getParameter("gender");
                String newBirth = req.getParameter("dayOfBirth");
                message = UserService.getInstance().saveChange(newName, newGender, newBirth, user);
                break;
        }
        resp.sendRedirect("/user");



    }

    public void destroy() {
    }
}