package com.example.demo.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControllor {
	@RequestMapping("/")
	public String root() {
		
		return "index";
	}
}
