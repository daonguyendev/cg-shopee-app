package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.Product;
import com.codegym.cgshopeeapp.model.entity.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ProductDao {
    private List<Product> products = null;

    public List<Product> getAllInfo() {

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
                products.add(product);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public void insert(Product product) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO product (name,origin_unit_price,promote,current_price,quantity) " +
                    "VALUES( ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getOriginUnitPrice());
            preparedStatement.setInt(4, product.getPromote());
            preparedStatement.setInt(5, product.getCurrentPrice());
            preparedStatement.setInt(6, product.getQuantity());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "DELETE FROM product WHERE id like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Product product) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "UPDATE product " +
                    "SET id_user = ?, name = ?, origin_unit_price = ?, promote = ?, current_price = ?, quantity = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, product.getIdUser());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getOriginUnitPrice());
            preparedStatement.setInt(4, product.getPromote());
            preparedStatement.setInt(5, product.getCurrentPrice());
            preparedStatement.setInt(6, product.getQuantity());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    kiem tra xem ton tai hay chua
    public boolean find(String email, String productName) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select name,origin_unit_price,promote,current_price,quantity from user u join product p on u.email = p.product_id where p.product_name = ? and u.user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, productName);
            preparedStatement.setString(2, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (preparedStatement.executeUpdate() > 0) {
//                da ton tai
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    //    lay san pham theo cua hang
    public void get(String email) {

        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select name,origin_unit_price,promote,current_price,quantity from user u join product p on u.email = p.product_id where  u.user_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setName(resultSet.getString("id"));
                product.setIdUser(resultSet.getString("user_id"));
                product.setName(resultSet.getString("name"));
                product.setName(resultSet.getString("origin_unit_price"));
                product.setName(resultSet.getString("promote"));
                product.setName(resultSet.getString("current_price"));
                product.setName(resultSet.getString("quantity"));
                products.add(product);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
