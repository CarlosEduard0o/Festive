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

    @JsonProperty("meetup_title")
    private String title;

    @JsonProperty("meetup_information")
    private String information;

    @JsonProperty("account_id")
    private int account_id;

    @JsonProperty("meetup_cep_address")
    private String cep_address;

    @JsonProperty("meetup_state_address")
    private String state_address;

    @JsonProperty("meetup_city_address")
    private String city_address;

    @JsonProperty("meetup_neighborhood_address")
    private String neighborhood_address;

    @JsonProperty("meetup_number_address")
    private String number_address;

    @JsonProperty("meetup_street_address")
    private String street_address;

    @JsonProperty("meetup_date")
    private ZonedDateTime event_date;

    @JsonProperty("meetup_stage")
    private MeetupStageEnum stage;

    public Meetup(String title,
                  String information,
                  int account_id,
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
        this.account_id = account_id;
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
