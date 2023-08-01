package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class trainersController {
	@RequestMapping("/trainers.html")
	public String index(Model model) {
		return "views/trainers";
	}
}
