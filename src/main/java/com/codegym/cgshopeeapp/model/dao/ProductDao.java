package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ProductDao {
    private static List<Product> products;

    public static List<Product> getAllInfo() {

        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from product";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();

                product.setId(Integer.parseInt(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("user_id"));
                product.setName(resultSet.getString("name"));
                product.setOriginUnitPrice(Integer.parseInt(resultSet.getString("origin_unit_price")));
                product.setPromote(Integer.parseInt(resultSet.getString("promote")));
                product.setCurrentPrice(Integer.parseInt(resultSet.getString("current_price")));
                product.setQuantity(Integer.parseInt(resultSet.getString("quantity")));
                product.setUrl(resultSet.getString("url"));
                products.add(product);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void insert(Product product) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO product (name,origin_unit_price,promote,current_price,quantity,url) VALUES( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getOriginUnitPrice());
            preparedStatement.setInt(4, product.getPromote());
            preparedStatement.setInt(5, product.getCurrentPrice());
            preparedStatement.setInt(6, product.getQuantity());
            preparedStatement.setString(7, product.getUrl());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Added user successfully.");
            } else {
                System.out.println("Failed to insert user.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "DELETE FROM product WHERE id like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("delete product successfully.");
            } else {
                System.out.println("Failed to delete product.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Product product) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "UPDATE product " +
                    "SET id_user = ?, name = ?, origin_unit_price = ?, promote = ?, current_price = ?, quantity = ?, url = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, product.getIdUser());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getOriginUnitPrice());
            preparedStatement.setInt(4, product.getPromote());
            preparedStatement.setInt(5, product.getCurrentPrice());
            preparedStatement.setInt(6, product.getQuantity());
            preparedStatement.setString(7, product.getUrl());
            preparedStatement.setInt(8, product.getId());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Update product succuessfully.");
            } else {
                System.out.println("Failed to update product.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    kiem tra xem ton tai hay chua
    public static boolean find(String email, String productName) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select name,origin_unit_price,promote,current_price,quantity from user u join product p on u.email = p.product_id where p.product_name = ? and u.user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, productName);
            preparedStatement.setString(2, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public static void get(String email) {

        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select name,origin_unit_price,promote,current_price,quantity,url from user u join product p on u.email = p.product_id where  u.user_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(Integer.valueOf(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("user_id"));
                product.setName(resultSet.getString("name"));
                product.setOriginUnitPrice(Integer.valueOf(resultSet.getString("origin_unit_price")));
                product.setPromote(Integer.valueOf(resultSet.getString("promote")));
                product.setCurrentPrice(Integer.valueOf(resultSet.getString("current_price")));
                product.setQuantity(Integer.valueOf(resultSet.getString("quantity")));
                product.setUrl(resultSet.getString("url"));
                products.add(product);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
