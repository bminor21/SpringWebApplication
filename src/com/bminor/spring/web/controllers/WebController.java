package com.bminor.spring.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bminor.spring.web.dao.Game;
import com.bminor.spring.web.service.GameService;

@Controller
public class WebController {
	
	private GameService gameService;
	
	@Autowired
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

	@RequestMapping("/")
	public String showHome( Model model ) {
		List<Game> current = gameService.getCurrent();
		model.addAttribute( "games", current );
		return "Home";
	}
	
}
