package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class UserDao {
    private List<User> users = null;

    public List<User> getAllInfo() {

        users = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from user";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                user.setEmailUser(resultSet.getString("email"));
                user.setPasswordUser(resultSet.getString("password"));
                user.setNameUser(resultSet.getString("name"));
                user.setAddressUser(resultSet.getString("address"));
                user.setAddressUser(resultSet.getString("status"));
                user.setAddressUser(resultSet.getString("verify_code"));
                user.setDateOfBirth(resultSet.getString("birth"));
                user.setGender(resultSet.getString("gender"));
                user.setPhoneNumber(resultSet.getString("phone_number"));
                user.setRole(resultSet.getString("role"));
                users.add(user);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public void insert(User user) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO user (email,password,name,gender,birth,phone_number,role,verify_code,address,status) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getEmailUser());
            preparedStatement.setString(2, user.getPasswordUser());
            preparedStatement.setString(3, user.getNameUser());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setString(5, user.getDateOfBirth());
            preparedStatement.setString(6, user.getPhoneNumber());
            preparedStatement.setString(7,user.getRole());
            preparedStatement.setString(8, user.getVerifyCode());
            preparedStatement.setString(9, user.getAddressUser());
            preparedStatement.setBoolean(10, user.isStatus());
            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("Added user successfully.");
            } else {
                System.out.println("Failed to insert user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean find(String email) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select email,password,name,verify_code,address,status,phoneNumber,dateOfBirth,gender from user u where u.email like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
