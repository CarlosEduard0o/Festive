package com.br.festive.demo.port.service;

import com.br.festive.demo.models.meetup.Meetup;
import com.br.festive.demo.models.meetup.MeetupStageEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;
import java.util.List;

public interface MeetupService {
    int createMeetup(
            final String title,
            final String information,
            final String cep_address,
            final String state_address,
            final String city_address,
            final String neighborhood_address,
            final String number_address,
            final String street_address,
            final ZonedDateTime event_date,
            final MeetupStageEnum stage
    );

    Meetup getMeetupById(final int id);

    List<Meetup> getAllMeetup();

    void updateMeetup(
            final int id,
            final String title,
            final String information,
            final String cep_address,
            final String state_address,
            final String city_address,
            final String neighborhood_address,
            final String number_address,
            final String street_address,
            final ZonedDateTime event_date,
            final MeetupStageEnum stage);

    void deleteMeetupById(final int id);

    void deleteAllMeetups();
}
