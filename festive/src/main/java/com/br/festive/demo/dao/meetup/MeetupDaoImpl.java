package com.br.festive.demo.dao.meetup;

import com.br.festive.demo.models.meetup.Meetup;
import com.br.festive.demo.models.meetup.MeetupStageEnum;
import com.br.festive.demo.port.dao.meetup.MeetupDao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.ZoneId;
import java.util.ArrayList;
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

        final String sql = "DELETE FROM meetup WHERE id = ? ;";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteAllAccountMeetups(final int account_id) {
        final String sql = "DELETE FROM meetup where account_id = ? ;";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, account_id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Meetup readById(int id) {
        final String sql = "SELECT * FROM meetup WHERE id = ? ;";

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                final Meetup meetup = new Meetup(
                        resultSet.getString("meetup_title"),
                        resultSet.getString("meetup_information"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("meetup_cep_address"),
                        resultSet.getString("meetup_state_address"),
                        resultSet.getString("meetup_city_address"),
                        resultSet.getString("meetup_neighborhood_address"),
                        resultSet.getString("meetup_number_address"),
                        resultSet.getString("meetup_street_address"),
                        resultSet.getTimestamp("meetup_date").toInstant().atZone(ZoneId.systemDefault()),
                        MeetupStageEnum.fromString(resultSet.getString("meetup_stage"))
                );
                return meetup;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Meetup> readAll() {
        final List<Meetup> meetups = new ArrayList<>();
        final String sql = "SELECT * FROM meetup; ";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                final Meetup meetup = new Meetup(
                        resultSet.getString("meetup_title"),
                        resultSet.getString("meetup_information"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("meetup_cep_address"),
                        resultSet.getString("meetup_state_address"),
                        resultSet.getString("meetup_city_address"),
                        resultSet.getString("meetup_neighborhood_address"),
                        resultSet.getString("meetup_number_address"),
                        resultSet.getString("meetup_street_address"),
                        resultSet.getTimestamp("meetup_date").toInstant().atZone(ZoneId.systemDefault()),
                        MeetupStageEnum.fromString(resultSet.getString("meetup_stage"))
                );
                meetups.add(meetup);
            }
            return meetups;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void update(int id, Meetup entity) {
        String sql = "UPDATE meetup SET title = ?, information = ?, cep_address = ?, state_address = ?, city_address = ?, ";
        sql += "neighborhood_address = ?, number_address = ?, street_address = ?, event_date = ?, stage = ? ";
        sql += "WHERE id = ? ;";

        try{
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement(sql);
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
            preparedStatement.setInt(11, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
