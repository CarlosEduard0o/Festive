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

//    @GetMapping("/{id}")
    @GetMapping("/1")
//    public String getMeetupById(@PathVariable int id, Model model){
    public String getMeetupById(Model model){
//        Meetup meetup = meetupService.getMeetupById(1);
//        model.addAttribute("meetupImageUrl", meetup.getMeetupImageUrl());
//        model.addAttribute("meetupName", meetup.getTitle());
//        model.addAttribute("meetupImageUrl", "/images/festival-1.jpg");
        model.addAttribute("meetupName", "Rock in Rio");
        return "event-page";
    }
}
