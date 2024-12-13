package com.br.festive.demo.dao.meetup;

import com.br.festive.demo.models.meetup.Meetup;
import com.br.festive.demo.port.dao.meetup.MeetupDao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class MeetupDaoImpl implements MeetupDao {

    private final Connection connection;

    public MeetupDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int save(Meetup entity) {
        String sql = "INSERT INTO meetup (title, information, cep_address, state_address, city_address,";
        sql += "neighborhood_address, number_address, street_address, event_date, stage) VALUES";
        sql += "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try{
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, entity.getTitle());
            preparedStatement.setString(2, entity.getInformation());
            preparedStatement.setString(3, entity.getCep_address());
            preparedStatement.setString(4, entity.getState_address());
            preparedStatement.setString(5, entity.getCity_address());
            preparedStatement.setString(6, entity.getNeighborhood_address());
            preparedStatement.setString(7, entity.getNumber_address());
            preparedStatement.setString(8, entity.getStreet_address());
            preparedStatement.setTimestamp(9, Timestamp.from(entity.getEvent_date().toInstant()));
            preparedStatement.setString(10, entity.getStage().toString().toLowerCase());

            preparedStatement.execute();

            resultSet = preparedStatement.getGeneratedKeys();

            if(resultSet.next()){
                final int id = resultSet.getInt(1);
                entity.setId(id);
            }

            connection.commit();

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            try{
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }

        return entity.getId();
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAllMeetups() {

    }

    @Override
    public Meetup readById(int id) {
        return null;
    }

    @Override
    public List<Meetup> readAll() {
        return null;
    }

    @Override
    public void update(int id, Meetup entity) {

    }
}
