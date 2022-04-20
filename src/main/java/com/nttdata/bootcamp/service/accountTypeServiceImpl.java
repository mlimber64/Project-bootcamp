package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.model.accountType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class accountTypeServiceImpl implements accountTypeService{
	
	@Autowired
	private accountTypeService repositoryAccountType;

	@Override
	public Flux<accountType> findAll() {
		return repositoryAccountType.findAll();
	}

	@Override
	public Mono<accountType> save(accountType accountType) {
		return repositoryAccountType.save(accountType);
	}

	@Override
	public Mono<accountType> update(accountType accountType) {
		return repositoryAccountType.save(accountType);
	}

	@Override
	public Mono<Void> delete(accountType accountType) {
		return repositoryAccountType.delete(accountType);
	}

}
