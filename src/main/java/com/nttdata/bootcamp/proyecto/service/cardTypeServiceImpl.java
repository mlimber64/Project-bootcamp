package com.nttdata.bootcamp.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.proyecto.model.cardType;
import com.nttdata.bootcamp.proyecto.repository.cardTypeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class cardTypeServiceImpl implements cardTypeService{
	
	@Autowired
	private cardTypeRepository repositorycardType;

	@Override
	public Flux<cardType> findAll() {
		return repositorycardType.findAll();
	}

	@Override
	public Mono<cardType> save(cardType cardType) {
		return repositorycardType.save(cardType);
	}

	@Override
	public Mono<cardType> update(cardType cardType) {
		return repositorycardType.save(cardType);
	}

	@Override
	public Mono<Void> delete(cardType cardType) {
		return repositorycardType.delete(cardType);
	}

}
