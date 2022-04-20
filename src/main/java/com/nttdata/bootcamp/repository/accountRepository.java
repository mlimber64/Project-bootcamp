package com.nttdata.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.model.account;

@Repository
public interface accountRepository extends ReactiveMongoRepository<account, Long> {

}
