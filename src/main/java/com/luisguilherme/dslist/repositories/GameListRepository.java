package com.luisguilherme.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisguilherme.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
