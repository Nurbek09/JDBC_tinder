package repository.impl;

import model.entity.Client;
import model.enums.*;
import repository.ClientRepository;
import repository.DbHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {

    private DbHelper dbHelper = new DbHelperImpl();
    @Override
    public void save(Client client) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement(
                "INSERT INTO client (status, createdDate, updatedDate, email, fullName, age, gender, famalyStatus, country, city, about, zodiac, birthDate)" +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)")) {

            preparedStatement.setString(1, client.getStatus().toString());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(client.getCreatedDate()));
            preparedStatement.setTimestamp(3, Timestamp.valueOf(client.getUpdatedDate()));
            preparedStatement.setString(4, client.getEmail());
            preparedStatement.setString(5, client.getFullName());
            preparedStatement.setInt(6, client.getAge());
            preparedStatement.setString(7, client.getGender().toString());
            preparedStatement.setString(8, client.getFamalyStatus().toString());
            preparedStatement.setString(9, client.getCountry().toString());
            preparedStatement.setString(10, client.getCity());
            preparedStatement.setString(11, client.getAbout());
            preparedStatement.setString(12, client.getZodiac().toString());
            preparedStatement.setTimestamp(13, Timestamp.valueOf(client.getBirthDate().atStartOfDay()));
            preparedStatement.executeUpdate();
        }catch (SQLException e){
        }
    }

    @Override
    public Client finddById(int id) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement(
                "SELECT * FROM client WHERE id = ?")) {
            preparedStatement.setInt(1, Math.toIntExact(id));
            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                Client client = new Client();
                client.setId((Integer) resultSet.getInt("id"));
                client.setStatus(ClientStatus.valueOf(resultSet.getString("status")));
                client.setCreatedDate(resultSet.getTimestamp("createdDate").toLocalDateTime());
                client.setUpdatedDate(resultSet.getTimestamp("updatedDate").toLocalDateTime());
                client.setEmail(resultSet.getString("email"));
                client.setFullName(resultSet.getString("fullName"));
                client.setAge(resultSet.getInt("age"));
                client.setGender(Gender.valueOf(resultSet.getString("gender")));
                client.setFamalyStatus(FamalyStatus.valueOf(resultSet.getString("famalyStatus")));
                client.setCountry(Country.valueOf(resultSet.getString("country")));
                client.setCity(resultSet.getString("city"));
                client.setAbout(resultSet.getString("about"));
                client.setZodiac(Zodiac.valueOf(resultSet.getString("zodiac")));
                client.setBirthDate(resultSet.getTimestamp("birthDate").toLocalDateTime().toLocalDate());
                return client;
            }
        } catch (SQLException e) {

        }
        return null;
    }

    @Override
    public List<Client> findAll() {

        List<Client> clientList = new ArrayList<>();

        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement(
                "SELECT * FROM client")) {

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                Client client = new Client();
                client.setId((Integer) resultSet.getInt("id"));
                client.setStatus(ClientStatus.valueOf(resultSet.getString("status")));
                client.setCreatedDate(resultSet.getTimestamp("createdDate").toLocalDateTime());
                client.setUpdatedDate(resultSet.getTimestamp("updatedDate").toLocalDateTime());
                client.setEmail(resultSet.getString("email"));
                client.setFullName(resultSet.getString("fullName"));
                client.setAge(resultSet.getInt("age"));
                client.setGender(Gender.valueOf(resultSet.getString("gender")));
                client.setFamalyStatus(FamalyStatus.valueOf(resultSet.getString("famalyStatus")));
                client.setCountry(Country.valueOf(resultSet.getString("country")));
                client.setCity(resultSet.getString("city"));
                client.setAbout(resultSet.getString("about"));
                client.setZodiac(Zodiac.valueOf(resultSet.getString("zodiac")));
                client.setBirthDate(resultSet.getTimestamp("birthDate").toLocalDateTime().toLocalDate());
                clientList.add(client);
            }

        } catch (SQLException e) {

        }
        return clientList;
    }

    @Override
    public void update(Client client) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("UPDATE client SET status = ?, createdDate = ?, updatedDate = ?, " +
                        "email = ?, fullName = ?, age = ?, gender = ?, " +
                        "famalyStatus = ?, country = ?, city = ?, about = ?, zodiac = ?, birthDate = ? WHERE id =? ")) {

            preparedStatement.setString(1, client.getStatus().toString());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(client.getCreatedDate()));
            preparedStatement.setTimestamp(3, Timestamp.valueOf(client.getUpdatedDate()));
            preparedStatement.setString(4, client.getEmail());
            preparedStatement.setString(5, client.getFullName());
            preparedStatement.setInt(6, client.getAge());
            preparedStatement.setString(7, client.getGender().toString());
            preparedStatement.setString(8, client.getFamalyStatus().toString());
            preparedStatement.setString(9, client.getCountry().toString());
            preparedStatement.setString(10, client.getCity());
            preparedStatement.setString(11, client.getAbout());
            preparedStatement.setString(12, client.getZodiac().toString());
            preparedStatement.setTimestamp(13, Timestamp.valueOf(client.getBirthDate().atStartOfDay()));
            preparedStatement.setInt(14, client.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        }
    }

    @Override
    public void deleteById(int id) {

    }
}