package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.service.VerifyService;

import java.io.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VerifyController", value = "/verify")
public class VerifyController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        boolean isValid = VerifyService.getInstance().verify(email,code);
        if (isValid){
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
            request.setAttribute("a","signin");
            message = "Xác thực thành công, vui lòng đăng nhập";
            request.setAttribute("message",message);
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            }
        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/signin-form.jsp");
            request.setAttribute("a","signin");
            message = "Có lỗi xác thực, vui lòng liên hệ bộ phận chăm sóc khách hàng để được hỗ trợ";
            request.setAttribute("message",message);
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void destroy() {
    }
}