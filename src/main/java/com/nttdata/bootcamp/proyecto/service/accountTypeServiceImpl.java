package com.nttdata.bootcamp.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.proyecto.model.accountType;
import com.nttdata.bootcamp.proyecto.repository.accountTypeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class accountTypeServiceImpl implements accountTypeService{
	
	@Autowired
	private accountTypeRepository repositoryAccountType;

	public Flux<accountType> findAll() {
		return this.repositoryAccountType.findAll();
	}
	

	@Override
	public Mono<accountType> save(Mono<accountType> a) {
		return a.flatMap(repositoryAccountType::insert);
	}

	@Override
	public Mono<accountType> update(accountType accountType) {
		return repositoryAccountType.save(accountType);
	}

	@Override
	public Mono<accountType> delete(String id) {
		return repositoryAccountType.findById(id)
				.flatMap(delete -> repositoryAccountType.delete(delete)
						.then(Mono.just(delete)));
	}



}
