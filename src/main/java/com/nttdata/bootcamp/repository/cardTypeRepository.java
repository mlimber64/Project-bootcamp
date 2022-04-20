package com.nttdata.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.model.cardType;

@Repository
public interface cardTypeRepository extends ReactiveMongoRepository<cardType, Long>{

}
