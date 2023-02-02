package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {
	
	@GetMapping("/index")
	public String index() {
		return "exam01.html";
	}
	
	@PostMapping("/input-name")
	public String inputName(String name, Model model) {
		model.addAttribute("name", name);
		return "exam01-result.html";
	}

}
