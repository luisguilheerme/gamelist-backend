package com.luisguilherme.dslist.dto;

import com.luisguilherme.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {		
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}		
	
	
}
