package com.journaldev.spring.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jorunaldev.spring.model.User;


@Controller
public class HomeController {
			
	@RequestMapping(value="/",method=RequestMethod.GET)
	public  String home(Locale locale,Model model) {
		System.out.println("Home page Requested, locale ="+locale);
		Date date=new Date();
		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale);
		String formattedDate=dateFormat.format(date);
		model.addAttribute("serverTime",formattedDate);
		return "home";
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String user(@Validated User user,Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("UserName: ",user.getUserName());
		return "user";
	}

}
