package com.bminor.spring.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		model.addAttribute( "platforms", Game.getAllowedPlatforms() );
		model.addAttribute( "game", new Game() );
		return "CreateGame";
	}
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST )
	public String doCreate( Model model, @Valid Game game, BindingResult result ) {
		
		// make sure form has met the requirements
		if( result.hasErrors() ) {
			model.addAttribute( "platforms", Game.getAllowedPlatforms() );
			return "CreateGame";
		}

		try {
			gameService.createGame( game );
		} catch( DuplicateKeyException e ) {
			result.rejectValue( "title", "DuplicateKey.game.title" );
			return "CreateGame";
		}
		
		return "GameCreated";
	}
	
	/*  This is now handled by : com.bminor.spring.web.controllers.DatabaseErrorHandler.java
	@ExceptionHandler(DataAccessException.class)
	public String handleDatabaseExcpetion( DataAccessException error ) {
		return "Error";
	}
	*/
}
