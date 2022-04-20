package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.model.card;
import com.nttdata.bootcamp.repository.cardRepository;

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
	public Mono<card> save(card card) {
		return repositoryCard.save(card);
	}

	@Override
	public Mono<card> update(card card) {
		return repositoryCard.save(card);
	}

	@Override
	public Mono<Void> delete(card card) {
		return repositoryCard.delete(card);
	}

}
