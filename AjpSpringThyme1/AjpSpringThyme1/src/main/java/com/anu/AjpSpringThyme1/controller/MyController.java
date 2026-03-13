package com.anu.AjpSpringThyme1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greetings")
public class MyController {

    @RequestMapping("/sayHello")
    public String greetUser(Model model) {

        String message ="hi sirs and madams";
        model.addAttribute("message",message);

        return "welcome";
    }
}