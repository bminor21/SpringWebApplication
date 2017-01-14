package com.bminor.spring.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Game {

	private int id;
	
	@Size(min=1, max=35, message="Game title name must be present")
	private String title;
	
	@Size(min=1, max=35, message="Developer name must be present")
	private String developer;
	
	@NotNull
	@Size(min=1, max=35, message="Select a platform")
	private String platform;
	
	public Game() {}

	public Game(String title, String developer, String platform) {
		this.title = title;
		this.developer = developer;
		this.platform = platform;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", title=" + title + ", developer=" + developer + ", platform=" + platform + "]";
	}
	
	

}
