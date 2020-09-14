package com.jsrefine.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsrefine")
public class MainController {

	@RequestMapping("/home")
	public String getMain() {
		System.out.println("jsrefine");
		return "jsrefine/index"; // View 이름 리턴
	}
}
