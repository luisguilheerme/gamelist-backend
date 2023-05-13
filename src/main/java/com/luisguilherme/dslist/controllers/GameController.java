package com.luisguilherme.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisguilherme.dslist.dto.GameDTO;
import com.luisguilherme.dslist.dto.GameMinDTO;
import com.luisguilherme.dslist.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();		
		return result;
	}
	
	@GetMapping(value="/{id}")
	public GameDTO findbyId(@PathVariable Long id){
		GameDTO result = gameService.findbyID(id);			
		return result;
	}

}
