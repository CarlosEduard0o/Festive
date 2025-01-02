package com.br.festive.demo.models.meetup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.ZonedDateTime;
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Meetup {

    //Adicionar categoria

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

    @JsonProperty("meetup_image_url")
    private String meetupImageUrl;

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
                  String meetupImageUrl,
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
        this.meetupImageUrl = meetupImageUrl;
        this.event_date = event_date;
        this.stage = stage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getCep_address() {
        return cep_address;
    }

    public void setCep_address(String cep_address) {
        this.cep_address = cep_address;
    }

    public String getState_address() {
        return state_address;
    }

    public void setState_address(String state_address) {
        this.state_address = state_address;
    }

    public String getCity_address() {
        return city_address;
    }

    public void setCity_address(String city_address) {
        this.city_address = city_address;
    }

    public String getNeighborhood_address() {
        return neighborhood_address;
    }

    public void setNeighborhood_address(String neighborhood_address) {
        this.neighborhood_address = neighborhood_address;
    }

    public String getNumber_address() {
        return number_address;
    }

    public void setNumber_address(String number_address) {
        this.number_address = number_address;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public ZonedDateTime getEvent_date() {
        return event_date;
    }

    public void setEvent_date(ZonedDateTime event_date) {
        this.event_date = event_date;
    }

    public MeetupStageEnum getStage() {
        return stage;
    }

    public void setStage(MeetupStageEnum stage) {
        this.stage = stage;
    }

    public String getMeetupImageUrl() {
        return meetupImageUrl;
    }

    public void setMeetupImageUrl(String meetupImageUrl) {
        this.meetupImageUrl = meetupImageUrl;
    }
}
