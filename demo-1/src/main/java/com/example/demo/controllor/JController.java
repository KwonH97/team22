package com.example.demo.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/j")
public class JController {

	@RequestMapping("/main")
	public String root() {
		return "main";
	}
}
