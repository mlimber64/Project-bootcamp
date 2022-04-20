package com.nttdata.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.model.customerType;

@Repository
public interface customerTypeRepository extends ReactiveMongoRepository<customerType, Long>{

}
