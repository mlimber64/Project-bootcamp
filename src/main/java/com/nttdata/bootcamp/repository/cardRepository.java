package com.nttdata.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.model.card;

@Repository
public interface cardRepository extends ReactiveMongoRepository<card, Long>{

}
