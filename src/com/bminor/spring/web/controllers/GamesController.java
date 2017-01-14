package com.bminor.spring.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bminor.spring.web.dao.Game;
import com.bminor.spring.web.service.GameService;

@Controller
public class GamesController {
	
	private GameService gameService;
	
	@Autowired
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

	@RequestMapping("/games")
	public String showGames( Model model ) {
		List<Game> current = gameService.getCurrent();
		model.addAttribute( "games", current );
		return "Games";
	}
	
	@RequestMapping("/creategame")
	public String createGame( Model model ) {
		List<String> platforms = new ArrayList<String>();
		platforms.add( "" );
		platforms.add( "PS1" );
		platforms.add( "PS2" );
		platforms.add( "PS3" );
		platforms.add( "PS4" );
		platforms.add( "PC" );
		platforms.add( "SNES" );
		platforms.add( "NES" );
		model.addAttribute( "platforms", platforms );
		return "CreateGame";
	}
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST )
	public String doCreate( Model model, @Valid Game game, BindingResult result ) {
		System.out.println( game );
		for( ObjectError error : result.getAllErrors() ){
			System.out.println( error.getDefaultMessage() );
		}
		return "GameCreated";
	}
	
}
