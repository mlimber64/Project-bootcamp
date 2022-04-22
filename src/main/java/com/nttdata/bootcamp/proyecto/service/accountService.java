package com.nttdata.bootcamp.proyecto.service;

import com.nttdata.bootcamp.proyecto.model.account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface accountService {
	
	public Flux<account> findAll();
	
	public Mono<account> save(account account);
	
	public Mono<account> update(account account);
	
	public Mono<Void> delete(account account);

}
