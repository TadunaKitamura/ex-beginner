package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("/index")
	public String index() {
		return "exam02.html";
	}

	@PostMapping("/add-result")
	public String addResult(Integer num1, Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", num1 + num2);
		return "exam02-result.html";

	}

	@GetMapping("/to-page2")
	public String toPage2() {
		return "exam02-result2.html";
	}

}
