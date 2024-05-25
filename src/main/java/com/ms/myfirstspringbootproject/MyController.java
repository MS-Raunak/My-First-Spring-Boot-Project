package com.ms.myfirstspringbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String homepage() {
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contactpage() {
		return "contact";
	}
	
}
