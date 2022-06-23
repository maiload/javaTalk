package com.java.talk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TalkController {
	private static final Logger logger
		=LoggerFactory.getLogger(TalkController.class);
	
	@GetMapping("/intro")
	public String intro() {
		logger.info("intro 화면");
		
		return "thymeleaf/intro";
	}
	
	@GetMapping("/login")
	public String login() {
		logger.info("로그인 화면");
		
		return "thymeleaf/login";
	}
}
