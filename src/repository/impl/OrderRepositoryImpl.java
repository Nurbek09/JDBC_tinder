package repository.impl;

import model.entity.Order;
import repository.DbHelper;
import repository.OrderRepository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderRepositoryImpl implements OrderRepository {
    private DbHelper dbHelper = new DbHelperImpl();
    @Override
    public void save(Order order) {
//        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement(
//                "INSERT INTO order_tb (status, created_date, update_date, order)" +
//                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)")) {
//
//            preparedStatement.setString(1, client.getStatus().toString());
//            preparedStatement.setDate(2, client.getCreatedDate());
//            preparedStatement.setDate(3, client.getUpdatedDate());
//            preparedStatement.setString(4, client.getEmail());
//            preparedStatement.setString(5, client.getFullName());
//            preparedStatement.setInt(6, client.getAge());
//            preparedStatement.setString(7, client.getGender().toString());
//            preparedStatement.setString(8, client.getFamalyStatus().toString());
//            preparedStatement.setString(9, client.getCountry().toString());
//            preparedStatement.setString(10, client.getCity());
//            preparedStatement.setString(11, client.getAbout());
//            preparedStatement.setString(12, client.getZodiac().toString());
//            preparedStatement.setDate(13, client.getBirthDate());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {


//        }
   }
}
