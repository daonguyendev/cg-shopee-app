package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.UserDao;
import com.codegym.cgshopeeapp.model.entity.Cart;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.service.SignInService;

import java.io.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SignInSignUpControllerServlet", urlPatterns = {"/signin-signup"})
public class SignInSignUpController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String a = request.getParameter("a");
        switch (a) {
            case "signin":
                RequestDispatcher requestDispatcher1 = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
                try {
                    request.setAttribute("a", "signin");
                    requestDispatcher1.forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                }
                break;
            case "signup":
                RequestDispatcher requestDispatcher2 = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signup-form.jsp");
                try {
                    request.setAttribute("a", "signup");
                    requestDispatcher2.forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                }
                break;
            case "signout":
                HttpSession httpSession = request.getSession();
                httpSession.invalidate();
                RequestDispatcher requestDispatcher3 = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
                try {
                    request.setAttribute("a", "signin");
                    requestDispatcher3.forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                }
                break;
        }

    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String a = request.getParameter("a");
        switch (a) {
            case "signin":
                String email = request.getParameter("signin-email");
                String password = request.getParameter("signin-password");
                String url;
                SignInService signInService = SignInService.getInstance();
                signInService.check(email, password);
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("loginFailed", false);

                switch (signInService.number) {
                    case "1":
                        User user = UserDao.get(email, password);
                        Cart cart = new Cart();
                        httpSession.setAttribute("cart", cart);
                        httpSession.setAttribute("user", user);
                        response.sendRedirect(request.getContextPath() + "/home");
                        break;
                    case "2":
                        try {
                            httpSession.setAttribute("loginFailed", true);
                            message = "Đăng nhập thất bại, vui lòng xem lại tài khoản hoặc mật khẩu";
                            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
                            request.setAttribute("a", "signin");
                            request.setAttribute("message", message);
                            requestDispatcher.forward(request, response);
                        } catch (ServletException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case "3":
                        try {
                            httpSession.setAttribute("loginFailed", true);
                            message = "Tài khoản của bạn chưa được xác thực";
                            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
                            request.setAttribute("a", "signin");
                            request.setAttribute("message", message);
                            requestDispatcher.forward(request, response);
                        } catch (ServletException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                }

            case "signup":
                
                break;
        }
    }

    public void destroy() {
    }
}