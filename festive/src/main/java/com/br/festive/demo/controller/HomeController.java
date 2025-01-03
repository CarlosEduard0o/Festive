package com.br.festive.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping()
    public String home(Model model){
        model.addAttribute("message", "Welcome to Spring Boot!");
        return "home";
    }
}
