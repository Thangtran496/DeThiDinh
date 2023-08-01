package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class princingController {
	@RequestMapping("/princing.html")
	public String index(Model model) {
		return "views/princing";
	}
}
