package com.ssafy.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.boot.dto.User;

@Controller
@RequestMapping("/api")
public class HomeController {
	
	
	
	
	@GetMapping("/")
	public String home(Model model){
		User user = new User("박준영", 27, "남성");
		model.addAttribute("user", user);
		
		return "index";
	}
}
