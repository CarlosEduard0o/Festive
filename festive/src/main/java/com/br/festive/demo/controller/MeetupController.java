package com.br.festive.demo.controller;

import com.br.festive.demo.models.meetup.Meetup;
import com.br.festive.demo.port.service.meetup.MeetupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/meetup")
public class MeetupController {

    @Autowired
    private MeetupService meetupService;

    @GetMapping("/{id}")
    public String getMeetupById(@PathVariable final int id, Model model){
        Meetup meetup = meetupService.getMeetupById(id);
        model.addAttribute("meetup", meetup);
        return "event-page";
    }
}
