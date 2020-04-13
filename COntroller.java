package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class COntroller {
	
	
	
	@RequestMapping("/hello")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Test");
		return "welcome";
	}
}


