package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.Product;
import com.codegym.cgshopeeapp.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class UserDao {


    private static List<User> users;

    public static List<User> getUserInfo() {

        users = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from user";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setAddress(resultSet.getString("address"));
                user.setStatus(Boolean.valueOf(resultSet.getString("status")));
                user.setVerifyCode(resultSet.getString("verify_code"));
                user.setDateOfBirth(resultSet.getString("birth"));
                user.setGender(resultSet.getString("gender"));
                user.setPhoneNumber(resultSet.getString("phone_number"));
                user.setRole(resultSet.getString("role"));
                users.add(user);
                System.out.println(user);

            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void insert(User user) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO user (email,password,name,gender,birth,phone_number,role,verify_code,address,status) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setString(5, user.getDateOfBirth());
            preparedStatement.setString(6, user.getPhoneNumber());
            preparedStatement.setString(7, user.getRole());
            preparedStatement.setString(8, user.getVerifyCode());
            preparedStatement.setString(9, user.getAddress());
            preparedStatement.setBoolean(10, user.isStatus());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Added user successfully.");
            } else {
                System.out.println("Failed to insert user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean findByEmail(String email) {

        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select email from user where email like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("test");
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean find(String email, String password) {
        User user = new User();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select email,password from user u where u.email = ? and u.password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static User get(String email, String password) {
        User user = new User();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from user u where u.email = ? and u.password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setAddress(resultSet.getString("address"));
                user.setStatus(Boolean.valueOf(resultSet.getString("status")));
                user.setDateOfBirth(resultSet.getString("birth"));
                user.setGender(resultSet.getString("gender"));
                user.setPhoneNumber(resultSet.getString("phone_number"));
                user.setRole(resultSet.getString("role"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static void update(User user) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "UPDATE product SET email = ?, password = ?, name = ?, address = ?, status = ?, birth = ?, gender = ?, phone_number= ? , role = ? WHERE email = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3,user.getName());
            preparedStatement.setString(4, user.getAddress());
            preparedStatement.setString(5, String.valueOf(user.isStatus()) );
            preparedStatement.setString(6,user.getDateOfBirth());
            preparedStatement.setString(7, user.getGender());
            preparedStatement.setString(8, user.getPhoneNumber());
            preparedStatement.setString(9, user.getRole());
            preparedStatement.setString(10, user.getEmail());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Update product succuessfully.");
            } else {
                System.out.println("Failed to update product.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}