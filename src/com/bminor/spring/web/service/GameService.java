package com.bminor.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bminor.spring.web.dao.*;

@Service("gameService")
public class GameService {

	private GameDAO gameDao;
	
	public List<Game> getCurrent(){
		
		return gameDao.getGames();
	}

	@Autowired
	public void setGameDao(GameDAO gameDao) {
		this.gameDao = gameDao;
	}

	public void createGame( Game game ) {
		gameDao.addGame( game );
	}
	
	
	
}
