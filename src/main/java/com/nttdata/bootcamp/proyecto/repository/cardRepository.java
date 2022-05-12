package com.nttdata.bootcamp.proyecto.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.proyecto.model.card;

@Repository
public interface cardRepository extends ReactiveMongoRepository<card, String>{

}
