package com.ajp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajp.model.LoginPageModel;

@Controller
@RequestMapping("/login")
public class LoginControler {
	@RequestMapping("/showLoginPage")
	public String loadLoginPage(Model model) {
		LoginPageModel login =new LoginPageModel();
		model.addAttribute("login",login);
		return "loginpage";
	}
	@RequestMapping("/authenticate")
	public String validationLogin(@ModelAttribute LoginPageModel login,Model model) {
		if (login.getLoginId().equals("admin")&& login.getPassword().equals("password")) {
			model.addAttribute("login",login);
			return "success";
		}else 
			return "failedpage";
	}
	
}
