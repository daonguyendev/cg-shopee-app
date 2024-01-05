package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.service.SignUpService;

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

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        switch (a){
            case "signup":
                String email = request.getParameter("signup-email");
                String password = request.getParameter("signup-password");
                SignUpService signUpService = SignUpService.getInstance();
                boolean isValid = signUpService.signup(email, password);
                if (isValid) {
                    message = "Thư xác thực đã được gửi tới email của bạn.";
                } else {
                    message = "Email này đã được dùng để đăng ký tài khoản";
                }
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signup-form.jsp");
                request.setAttribute("a","signup");
                request.setAttribute("message",message);
                requestDispatcher.forward(request,response);
                break;
        }




    }

    public void destroy() {
    }
}