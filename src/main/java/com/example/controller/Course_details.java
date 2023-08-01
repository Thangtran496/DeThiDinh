package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Course_details {
	@RequestMapping("/course_details.html")
	public String index(Model model) {
		return "views/Course_details";
	}
}
