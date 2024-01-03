package com.codegym.cgshopeeapp.controller;

import java.io.*;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SignInSignUpControllerServlet", urlPatterns = {"/signin-signup"})
public class SignInSignUpController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String a = request.getParameter("a");
        switch (a){
            case "signin":
                RequestDispatcher requestDispatcher1 = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
                try {
                    request.setAttribute("a","signin");
                    requestDispatcher1.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                }
                break;
            case "signup":
                RequestDispatcher requestDispatcher2 = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signup-form.jsp");
                try {
                    request.setAttribute("a","signup");
                    requestDispatcher2.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                }
                break;
        }


    }

    public void destroy() {
    }
}