package com.luisguilherme.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisguilherme.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
