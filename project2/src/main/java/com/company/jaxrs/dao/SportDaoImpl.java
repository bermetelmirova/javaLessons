package com.company.jaxrs.dao;

import com.company.jaxrs.model.Sport;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.company.jaxrs.config.DBConfig.connect;

public class SportDaoImpl implements SportDao {
    @Override
    public Sport saveSport(Sport sport) {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into sport ( type_sport, payment)." +
                     "values(?, ?)")) {
            preparedStatement.setString(1, sport.getNameSport());
            preparedStatement.setInt(2, sport.getPayment());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Sport findById(Long id) {
        try (ResultSet resultSet = connect().createStatement().executeQuery(
                "select *  from sport where id = " + id)) {
            if (resultSet.next()) {
                System.out.println(resultSet.getString("type_sport"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Sport deleteById(Sport sport) {
        return null;
    }

    @Override
    public Sport update(Sport sport) {
        return null;
    }
}
