package com.nttdata.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.model.accountType;

@Repository
public interface accountTypeRepository extends ReactiveMongoRepository<accountType, Long>{

}
