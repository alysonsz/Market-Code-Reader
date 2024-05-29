package com.example.marketcodereader.services;
import com.example.marketcodereader.models.Product;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
    private java.sql.Connection connection;

    public DBconnection() {
    }

    public void connect(){
        try {
            Class.forName("org.sqlite.JDBC");
            String path = "jdbc:sqlite:products.db";
            connection = DriverManager.getConnection(path);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Product getProduct(Long barCode){
        try {
            Statement statement = connection.createStatement();
            String sql = String.format("SELECT code, name, price FROM products WHERE code='%s'", barCode);
            ResultSet rs = statement.executeQuery(sql);
            return new Product(rs.getLong("code"), rs.getString("name"), rs.getDouble("price"));
        }catch (Exception e){
            return null;
        }
    }

    public void close() {
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
