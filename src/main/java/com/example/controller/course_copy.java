package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class course_copy {
	@RequestMapping("/course_copy.html")
	public String index(Model model) {
		return "views/course_copy";
	}
}
