package com.br.festive.demo.models.meetup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.ZonedDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Meetup {

    private int id;

    @JsonProperty("event_title")
    private String title;

    @JsonProperty("event_information")
    private String information;

    @JsonProperty("event_cep_address")
    private String cep_address;

    @JsonProperty("event_state_address")
    private String state_address;

    @JsonProperty("event_city_address")
    private String city_address;

    @JsonProperty("event_neighborhood_address")
    private String neighborhood_address;

    @JsonProperty("event_number_address")
    private String number_address;

    @JsonProperty("event_street_address")
    private String street_address;

    @JsonProperty("event_date")
    private ZonedDateTime event_date;

    @JsonProperty("event_stage")
    private MeetupStageEnum stage;

    public Meetup(String title,
                  String information,
                  String cep_address,
                  String state_address,
                  String city_address,
                  String neighborhood_address,
                  String number_address,
                  String street_address,
                  ZonedDateTime event_date,
                  MeetupStageEnum stage) {
        this.title = title;
        this.information = information;
        this.cep_address = cep_address;
        this.state_address = state_address;
        this.city_address = city_address;
        this.neighborhood_address = neighborhood_address;
        this.number_address = number_address;
        this.street_address = street_address;
        this.event_date = event_date;
        this.stage = stage;
    }
}
