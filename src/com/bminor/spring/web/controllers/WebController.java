package com.bminor.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping("/")
	public String showHome( Model model ) {
		model.addAttribute( "name", "Brett" );
		return "Home";
	}
	
}
