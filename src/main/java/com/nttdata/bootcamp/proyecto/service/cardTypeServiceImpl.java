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
	public Mono<cardType> save(cardType ct) {
		return repositorycardType.save(ct);
	}

	@Override
	public Mono<cardType> update(String id, cardType ct) {
		return repositorycardType.findById(id)
				.flatMap(at -> {
					ct.setId(id);
					return save(ct);
				})
				.switchIfEmpty(Mono.empty());
	}

	@Override
	public Mono<cardType> delete(String id) {
		return repositorycardType
				.findById(id)
				.flatMap(c -> repositorycardType.deleteById(c.getId()).thenReturn(c));
	}


	
}
