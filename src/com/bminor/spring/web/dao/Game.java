package com.bminor.spring.web.dao;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.bminor.spring.web.annotations.ValidatePlatform;
import com.bminor.spring.web.annotations.ValidatePrice;

public class Game {
	
	@Size(min=1, max=35)
	private String title;
	
	@Size(min=1, max=35)
	private String developer;
	
	@ValidatePlatform
	private String platform;
	
	@ValidatePrice
	private String price;
	
	public Game() {}

	public Game(String title, String developer, String platform, String price ) {
		this.title = title;
		this.developer = developer;
		this.platform = platform;
		this.price = price;
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
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice( String price ){
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Game [title=" + title + ", developer=" + developer + ", platform=" + platform
				+ ", price=" + price + "]";
	}

	public static List<String> getAllowedPlatforms(){
		List<String> platforms = new ArrayList<String>();
		platforms.add( "" );
		platforms.add( "PS1" );
		platforms.add( "PS2" );
		platforms.add( "PS3" );
		platforms.add( "PS4" );
		platforms.add( "PC" );
		platforms.add( "SNES" );
		platforms.add( "NES" );
		return platforms;
	}
	

}
