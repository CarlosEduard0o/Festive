package com.br.festive.demo.api;

import com.br.festive.demo.dao.meetup.MeetupDaoImpl;
import com.br.festive.demo.port.dao.meetup.MeetupDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

@Configuration
public class ApiConfig {

    @Bean
    public MeetupDao getMeetupDao(final Connection connection){
        return new MeetupDaoImpl(connection);
    }
}
