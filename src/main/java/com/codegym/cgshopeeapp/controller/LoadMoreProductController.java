package com.codegym.cgshopeeapp.controller;

import com.codegym.cgshopeeapp.model.dao.ProductDao;
import com.codegym.cgshopeeapp.model.entity.Product;

import java.io.*;
import java.util.List;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoadMoreProductController", urlPatterns = {"/load"})
public class LoadMoreProductController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int amount = Integer.parseInt(request.getParameter("exist"));
        List<Product> products = ProductDao.getnext6Product(amount);

        response.setContentType("text/html; charset=UTF-8");

        // Hello
        PrintWriter out = response.getWriter();

        for (Product p : products){
            out.println("<a href=\"/add?id="+p.getId()+"\" class=\"body-productContainer-product\">\n" +
                    "            <div class=\"body-productContainer-product-group\">\n" +
                    "                <img src=\""+p.getUrl()+"\" class=\"body-productContainer-product-prouctImg\"></img>\n" +
                    "                <div class=\"body-productContainer-product-productName\">\n" +
                    "                    "+p.getName()+"\n" +
                    "                </div>\n" +
                    "                <div class=\"body-productContainer-product-unitPrice\">\n" +
                    "                    <div class=\"body-productContainer-product-unitPrice-origin\"><sub>đ</sub>"+p.getOriginUnitPrice()+"</div>\n" +
                    "                    <div class=\"body-productContainer-product-unitPrice-sell\"><sub>đ</sub>"+p.getCurrentPrice()+"</div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </a>");
        }
        out.flush();
        out.close();
    }

    public void destroy() {
    }
}