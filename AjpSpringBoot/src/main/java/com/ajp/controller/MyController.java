package com.ajp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/greet")
	public String  sayHello(Model model) {
		String message ="welcome to Spring based MVC";
		model.addAttribute("mymessage",message);
		return "welcome";
	}
	
}
