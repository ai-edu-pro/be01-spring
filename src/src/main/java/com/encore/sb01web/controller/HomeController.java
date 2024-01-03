package com.encore.sb01web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		
//		model.addAttribute("name", "강감찬");
		
		String name = "강감찬";
		model.addAttribute("name", name);
		
		return "home";  // 
	}
}
