package com.br.festive.demo.service.meetup;

import com.br.festive.demo.models.meetup.Meetup;
import com.br.festive.demo.models.meetup.MeetupStageEnum;
import com.br.festive.demo.port.dao.meetup.MeetupDao;
import com.br.festive.demo.port.service.MeetupService;

import java.time.ZonedDateTime;
import java.util.List;

public class MeetupServiceImpl implements MeetupService {

    private final MeetupDao meetupDao;

    public MeetupServiceImpl(MeetupDao meetupDao){
        this.meetupDao = meetupDao;
    }

    @Override
    public int createMeetup(String title,
                            String information,
                            String cep_address,
                            String state_address,
                            String city_address,
                            String neighborhood_address,
                            String number_address,
                            String street_address,
                            ZonedDateTime event_date,
                            MeetupStageEnum stage) {

        Meetup meetup = new Meetup(title,
                 information,
                 cep_address,
                 state_address,
                 city_address,
                 neighborhood_address,
                 number_address,
                 street_address,
                 event_date,
                 stage);

        return meetupDao.save(meetup);
    }

    @Override
    public Meetup getMeetupById(int id) {
        return meetupDao.readById(id);
    }

    @Override
    public List<Meetup> getAllMeetup() {
        return meetupDao.readAll();
    }

    @Override
    public void updateMeetup(int id,
                             String title,
                             String information,
                             String cep_address,
                             String state_address,
                             String city_address,
                             String neighborhood_address,
                             String number_address,
                             String street_address,
                             ZonedDateTime event_date,
                             MeetupStageEnum stage) {

        Meetup meetup = new Meetup(title,
                information,
                cep_address,
                state_address,
                city_address,
                neighborhood_address,
                number_address,
                street_address,
                event_date,
                stage);

        meetupDao.update(id,meetup);
    }

    @Override
    public void deleteMeetupById(int id) {
        meetupDao.deleteById(id);
    }

    @Override
    public void deleteAllMeetups() {
        meetupDao.deleteAllMeetups();
    }
}
