package com.nttdata.bootcamp.proyecto.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.proyecto.model.card;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface cardService {
	
	Flux<card> findAll();
	
	Mono<card> save(card c);
	
	Mono<card> update(String id ,card c);
	
	Mono<card> delete(String id);

}
