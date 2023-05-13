package com.luisguilherme.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luisguilherme.dslist.dto.GameDTO;
import com.luisguilherme.dslist.dto.GameMinDTO;
import com.luisguilherme.dslist.entities.Game;
import com.luisguilherme.dslist.repositories.GameRepository;

@Service
public class GameService {	
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly=true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

	@Transactional(readOnly=true)
	public GameDTO findbyID(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);		
	}
}
