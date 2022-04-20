package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.model.cardType;
import com.nttdata.bootcamp.repository.cardTypeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class cardTypeServiceImpl implements cardTypeService{
	
	@Autowired
	private cardTypeRepository repositoryCardType;

	@Override
	public Flux<cardType> findAll() {
		return repositoryCardType.findAll();
	}

	@Override
	public Mono<cardType> save(cardType cardType) {
		return repositoryCardType.save(cardType);
	}

	@Override
	public Mono<cardType> update(cardType cardType) {
		return repositoryCardType.save(cardType);
	}

	@Override
	public Mono<Void> delete(cardType cardType) {
		return repositoryCardType.delete(cardType);
	}

}
