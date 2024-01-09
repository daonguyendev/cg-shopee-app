package com.codegym.cgshopeeapp.model.dao;

import com.codegym.cgshopeeapp.Connection.JdbcConnection;
import com.codegym.cgshopeeapp.model.entity.Category;
import com.codegym.cgshopeeapp.model.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProductDao {
    private static List<Product> products;

    public static List<Product> getProductInfo() {
        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from product";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(Integer.valueOf(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
                product.setName(resultSet.getString("name"));
                product.setOriginUnitPrice(Integer.valueOf(resultSet.getString("origin_unit_price")));
                product.setPromote(Integer.valueOf(resultSet.getString("promote")));
                product.setCurrentPrice(Integer.valueOf(resultSet.getString("current_price")));
                product.setQuantity(Integer.valueOf(resultSet.getString("quantity")));
                product.setUrl(resultSet.getString("url"));
                product.setCategory(resultSet.getString("category"));
                products.add(product);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static List<Product> get6Product() {

        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from product limit 6";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();

                product.setId(Integer.parseInt(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
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

    public static List<Product> getnext6Product(int amount) {

        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * FROM product\n" +
                    "ORDER BY id\n" +
                    "LIMIT 6 OFFSET ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, amount);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();

                product.setId(Integer.parseInt(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
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
            String query = "INSERT INTO product (id_user,name,origin_unit_price,promote,current_price,quantity,url,category) VALUES( ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, product.getIdUser());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getOriginUnitPrice());
            preparedStatement.setInt(4, product.getPromote());
            preparedStatement.setInt(5, product.getCurrentPrice());
            preparedStatement.setInt(6, product.getQuantity());
            preparedStatement.setString(7, product.getUrl());
            preparedStatement.setString(8, product.getCategory());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Added user successfully.");
            } else {
                System.out.println("Failed to insert user.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteById(int id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "DELETE FROM product WHERE id = ?";
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
                    "SET id_user = ? , name = ?, origin_unit_price = ?, promote = ?, current_price = ?, quantity = ?, url = ?, category = ? WHERE  id_user = ?  and id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, product.getIdUser());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getOriginUnitPrice());
            preparedStatement.setInt(4, product.getPromote());
            preparedStatement.setInt(5, product.getCurrentPrice());
            preparedStatement.setInt(6, product.getQuantity());
            preparedStatement.setString(7, product.getUrl());
            preparedStatement.setString(8, product.getCategory());
            preparedStatement.setString(9, product.getIdUser());
            preparedStatement.setInt(10, product.getId());
//            preparedStatement.setString(9, product.getName());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Update product succuessfully.");
            } else {
                System.out.println("Failed to update product.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean findByNameAndEmail(String email, String name) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select id,id_user from product p where p.name = ? and p.id_user = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
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
    public static List<Product> getByEmail(String email) {
        products = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select id, id_user , name,origin_unit_price,promote,current_price,quantity,url,category from product p where  p.id_user = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(Integer.valueOf(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
                product.setName(resultSet.getString("name"));
                product.setOriginUnitPrice(Integer.valueOf(resultSet.getString("origin_unit_price")));
                product.setPromote(Integer.valueOf(resultSet.getString("promote")));
                product.setCurrentPrice(Integer.valueOf(resultSet.getString("current_price")));
                product.setQuantity(Integer.valueOf(resultSet.getString("quantity")));
                product.setUrl(resultSet.getString("url"));
                product.setCategory(resultSet.getString("category"));
                products.add(product);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public static List<String> getCategory() {
        List<String> category = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select distinct category from product;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String categoryValue = resultSet.getString("category");
                category.add(categoryValue);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }
    public static Product getById(int id) {
        products = new LinkedList<>();
        Product product = null;
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from product p where  p.id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product = new Product();
                product.setId(Integer.valueOf(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
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
        return product;
    }
    public static List<Product> getByName(String name) {
        products = new LinkedList <>();
        Product product = null;
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from product p where  p.name like ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String nameQuerry = "%" + name + "%";
            preparedStatement.setString(1, nameQuerry);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product = new Product();
                product.setId(Integer.valueOf(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
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
        return products;
    }

    public static List<Category> getCategoryInfo() {
        List <Category> category = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select name,url from category";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Category oneCategory = new Category();
                oneCategory.setName(resultSet.getString("name"));
                oneCategory.setUrl(resultSet.getString("url"));
                category.add(oneCategory);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }
    public static List<Product> getProductCategoryInfo(String category) {
        List <Product> productList = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "select * from product p where  p.category =?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, category);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               Product product = new Product();
                product.setId(Integer.valueOf(resultSet.getString("id")));
                product.setIdUser(resultSet.getString("id_user"));
                product.setName(resultSet.getString("name"));
                product.setOriginUnitPrice(Integer.valueOf(resultSet.getString("origin_unit_price")));
                product.setPromote(Integer.valueOf(resultSet.getString("promote")));
                product.setCurrentPrice(Integer.valueOf(resultSet.getString("current_price")));
                product.setQuantity(Integer.valueOf(resultSet.getString("quantity")));
                product.setUrl(resultSet.getString("url"));
                product.setCategory(resultSet.getString("category"));
                productList.add(product);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}
