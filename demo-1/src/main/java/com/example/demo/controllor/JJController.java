package com.example.demo.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JJController {
	@RequestMapping("/hi")
	public @ResponseBody String text() {
		return "hi!!!!!";
	}
}
