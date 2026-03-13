package com.anu.AjpSpringThyme1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anu.AjpSpringThyme1.model.Login;

@Controller
@RequestMapping("/login")
public class LoginController {

@RequestMapping("/showLoginPage")
public String viewLoginPage(Model model) {

    Login login = new Login();
    model.addAttribute("login", login);

    return "loginPage";
}

@RequestMapping("/authenticate")
public String authenticate(@ModelAttribute Login login, Model model) {

//    String message = "Welcome " + login.getLoginID();
//    model.addAttribute("message", message);
//
//    return "welcome";
	if (login.getLoginID().equals("admin")&&login.getPassword().equals("password")) {
		model.addAttribute("login",login);
		return "success";
	}else {
		return "failpage";
	}
}
}