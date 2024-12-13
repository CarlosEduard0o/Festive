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

}
