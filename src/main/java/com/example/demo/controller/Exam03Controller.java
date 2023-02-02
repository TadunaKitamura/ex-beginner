package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext aplication;

	@GetMapping("/index")
	public String index() {
		return "exam03.html";
	}

	@PostMapping("/total-price")
	public String totalPrice(Integer price1, Integer price2, Integer price3) {
		aplication.setAttribute("subtotal", price1 + price2 + price3);
		aplication.setAttribute("total", (price1 + price2 + price3) * 1.1);
		return "exam03-result.html";
	}

}
