package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.Order;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class OrderDao {
    private List<Order> orders = null;

    public List<Order> getOrderInfor() {

        orders = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from order";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Order order = new Order();

                order.setId(Integer.parseInt(resultSet.getString("id")));
                order.setUserEmail(resultSet.getString("user_id"));
                order.setProductID(Integer.parseInt(resultSet.getString("product_id")));
                order.setQuantity(Integer.parseInt(resultSet.getString("product_quantity")));
                order.setTotalPrice(Integer.parseInt(resultSet.getString("total_price")));
                order.setDateTime(LocalDateTime.parse(resultSet.getString("date_time")));
                orders.add(order);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    public void insert(Order order) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO user (user_id,product_id,product_quantity,total_price,date_time) " +
                    "VALUES(  ?, ?, ?, ?, ? )";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, order.getUserEmail());
            preparedStatement.setInt(2, order.getProductID());
            preparedStatement.setInt(3, order.getQuantity());
            preparedStatement.setInt(4, order.getTotalPrice());
            preparedStatement.setString(5, String.valueOf(order.getDateTime()));
            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("insert order successfully.");
            } else {
                System.out.println("Failed to insert order.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Order order) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "DELETE FROM product WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, order.getId());
            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("delete order successfully.");
            } else {
                System.out.println("Failed to delete order.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
