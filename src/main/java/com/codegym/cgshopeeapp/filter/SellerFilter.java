package com.codegym.cgshopeeapp.filter;


import com.codegym.cgshopeeapp.model.entity.User;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/product")
public class SellerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        User user = (User) httpServletRequest.getSession().getAttribute("user");

        if (user != null) {
            String role = user.getRole();
            if (role.equals("Shop")) {
                chain.doFilter(httpServletRequest,httpServletResponse);
            } else {
              ((HttpServletResponse) response).sendRedirect("/seller");
            }
        }else {
            chain.doFilter(httpServletRequest,httpServletResponse);
        }
    }
    public void destroy() {

    }
}
