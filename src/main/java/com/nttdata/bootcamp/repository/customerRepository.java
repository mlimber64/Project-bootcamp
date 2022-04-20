package com.nttdata.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcamp.model.customer;

import lombok.Data;

@Data
public interface customerRepository extends ReactiveMongoRepository<customer, Long>{

}
