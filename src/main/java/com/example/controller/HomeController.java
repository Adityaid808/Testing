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
	//home page controller view
	@RequestMapping("/home")
	public String homeView(Model map)
	{
		System.out.println("Aditya");
		return "welcome";
	}
	
	
	
	//home page controller view
	@RequestMapping("/home1")
	public String homeView1(Model map)
	{
        System.out.println("27-02-2022");
        System.out.println("inside home 1 controller 2");
        System.out.println("done git");
		map.addAttribute("timestamp",LocalDateTime.now());
		System.out.println("hello");
		System.out.println(1234567);
		System.out.println(112);
		System.out.println(1223344567);
		System.out.println(0000);
		System.out.println("last");
		System.out.println("1223344uhuhhuhuhuh567");

		map.addAttribute("arraylist",Arrays.asList(10,56,72,36,45));
		return "welcome1";
	}
	
}
