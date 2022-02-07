package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Home Controller
@Controller
public class HomeController {
	//home page controller
	@RequestMapping("/home")
	public String homeView(Model map)
	{
		return "welcome";
	}
	
	
	
	
	@RequestMapping("/home1")
	public String homeView1(Model map)
	{
		map.addAttribute("timestamp",LocalDateTime.now());
		
		map.addAttribute("arraylist",Arrays.asList(10,56,72,36,45));
		return "welcome1";
	}
	
}
