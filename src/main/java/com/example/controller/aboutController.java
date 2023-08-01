package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutController {
	@RequestMapping("/about.html")
	public String index(Model model) {
		return "views/about";
	}
}
