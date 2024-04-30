package by.dytni.shop.repository;

import by.dytni.shop.Pants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopRepository {
    private static String URL = "jdbc:postgresql://localhost:5432/pants";
    private static String USERNAME = "dytni";
    private static String PASSWORD = "1331";
    private void loadDriver(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Pants> getAll(){
        String SELECT = "SELECT * FROM pants";
        List<Pants> pants = new ArrayList<>();
        loadDriver();
        try(
                Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT)
                ) {

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                pants.add(new Pants(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("img")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return pants;

    }



}
