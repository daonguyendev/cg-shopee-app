package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.User;
import com.codegym.cgshopeeapp.model.entity.Wallet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletDao {
    public static Wallet getById(String id){
        Wallet wallet = new Wallet();

        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from wallet where wallet.id_user like ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                wallet.setIdUser(resultSet.getString("id_user"));
                wallet.setMoney(resultSet.getInt("money"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return wallet;
    }

    public static void insert(Wallet wallet){
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO wallet (id_user,money) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,wallet.getIdUser());
            preparedStatement.setInt(2,wallet.getMoney());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void update(Wallet wallet) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "UPDATE wallet SET id_user = ?, money = ? WHERE id_user = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, wallet.getIdUser());
            preparedStatement.setInt(2, wallet.getMoney());
            preparedStatement.setString(3, wallet.getIdUser());
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
