package com.tseringkalden.displaydate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "main.jsp";
		
	}
	
	@RequestMapping("/date")
	public String datepage(Model model) {
	java.util.Date date = new java.util.Date();
	model.addAttribute("date", date);
	return "date.jsp";
	
	
	}
	@RequestMapping("/time")
	public String timepage(Model model) {
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		model.addAttribute("time", localTime.format(dateTimeFormatter));
		return "time.jsp";
	}
}
