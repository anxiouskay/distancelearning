package com.distancelearning.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class allFileController {
	
	@RequestMapping(value="index.php")
	public String index() {
		return "hello";
	}
	
	@RequestMapping(value="hey.php")
	public String hey() {
		return "hey";
	}
}
