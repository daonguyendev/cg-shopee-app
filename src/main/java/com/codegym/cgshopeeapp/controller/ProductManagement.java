package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.entity.Product;
import com.codegym.cgshopeeapp.model.entity.User;

import java.io.*;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProductManagementServlet", urlPatterns = {"/product"})
public class ProductManagement extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/view/content/product-management.jsp");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("user");
        String email = user.getEmail();
        try {
            List<Product> products = ProductDao.getByEmail(email);
            List<String> category = ProductDao.getCategory();
            request.setAttribute("products", products);
            request.setAttribute("category", category);
            request.setAttribute("a", "pm");
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/content/product-management.jsp");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("user");
        String email = user.getEmail();
        String a = request.getParameter("a");
        List<String> category = ProductDao.getCategory();
        request.setAttribute("category", category);
        request.setAttribute("a", "pm");
        Product product = new Product();
        List<Product> products = ProductDao.getByEmail(email);
        request.setAttribute("products", products);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
        switch (a) {
            case "update":
                product.setIdUser(email);
                product.setName(request.getParameter("product-name"));
                product.setOriginUnitPrice(Integer.valueOf(request.getParameter("product-originPrice")));
                product.setCurrentPrice(Integer.valueOf(request.getParameter("product-sellPrice")));
                product.setQuantity(Integer.parseInt(request.getParameter("product-quantity")));
                product.setUrl(request.getParameter("product-urlAvatar"));
                product.setCategory(request.getParameter("category"));
                if (!request.getParameter("product-id").isEmpty()) {
                    product.setId(Integer.valueOf(request.getParameter("product-id")));
                    ProductDao.update(product);
                    response.sendRedirect(request.getContextPath() + "/product");
                } else if (!ProductDao.findByNameAndEmail(email,product.getName())) {
                    product.setIdUser(email);
                    product.setName(request.getParameter("product-name"));
                    product.setOriginUnitPrice(Integer.valueOf(request.getParameter("product-originPrice")));
                    product.setCurrentPrice(Integer.valueOf(request.getParameter("product-sellPrice")));
                    product.setQuantity(Integer.parseInt(request.getParameter("product-quantity")));
                    product.setUrl(request.getParameter("product-urlAvatar"));
                    product.setCategory(request.getParameter("category"));
                    ProductDao.insert(product);
                    response.sendRedirect(request.getContextPath() + "/product");
                } else {
                    message ="Sản phẩm" + ' ' + product.getName() + ' ' + "đã tồn tại";
                    request.setAttribute("message",message);
                }
                break;
            case "delete":
                int productId = Integer.parseInt(request.getParameter("productId"));
                ProductDao.deleteById(productId);
                response.sendRedirect(request.getContextPath() + "/product");
                break;
        }
    }
    public void destroy() {
    }
}