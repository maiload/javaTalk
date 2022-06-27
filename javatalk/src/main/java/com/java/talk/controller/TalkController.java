package com.java.talk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/main")
	public String main() {
		logger.info("메인 화면");
		
		return "thymeleaf/main";
	}
	
	@GetMapping("/chat")
	public String chat() {
		logger.info("채팅 화면");
		
		return "thymeleaf/chat";
	}
	
	@GetMapping("/more")
	public String more() {
		logger.info("더보기 화면");
		
		return "thymeleaf/more";
	}
	
	@GetMapping("/profile")
	public String profile(@RequestParam String userId
			, Model model) {
		logger.info("프로필 화면, userId={}", userId);
		
		model.addAttribute("userId", userId);
		
		return "thymeleaf/profile";
	}
	
	@GetMapping("/picture")
	public String picture() {
		logger.info("프로필 사진 보기");
		
		return "thymeleaf/picture";
	}
	
}
