package com.ajp.projMaven;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greetings")

public class MyXController {
	
	@RequestMapping("/sayHello")
	public String greetUser(Model model)
	{
		String mymessage = "We are creating MVC based apps..";
		model.addAttribute("mymessage", mymessage);
		return "welcome";
	}

}
