package com.nttdata.bootcamp.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.proyecto.model.card;
import com.nttdata.bootcamp.proyecto.repository.cardRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class cardServiceImpl implements cardService{
	
	@Autowired
	private cardRepository repositoryCard;

	@Override
	public Flux<card> findAll() {
		return repositoryCard.findAll();
	}

	
	@Override
	public Mono<card> save(card c) {
		return repositoryCard.save(c);
	}
	@Override
	public Mono<card> update(String id, card c) {
		return repositoryCard.findById(id)
				.flatMap(ca -> {
					c.setId(id);
					return save(c);
				})
				.switchIfEmpty(Mono.empty());
	}

	@Override
	public Mono<card> delete(String id) {
		return repositoryCard.findById(id)
				.flatMap(delete -> repositoryCard.delete(delete)
						.then(Mono.just(delete)));
	}







}
