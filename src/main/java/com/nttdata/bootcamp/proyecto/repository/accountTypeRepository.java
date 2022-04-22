package com.nttdata.bootcamp.proyecto.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.proyecto.model.accountType;

@Repository
public interface accountTypeRepository extends ReactiveMongoRepository<accountType, Long>{

}
