package com.nttdata.bootcamp.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.proyecto.model.account;
import com.nttdata.bootcamp.proyecto.repository.accountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class accountServiceImpl implements accountService{
	
	@Autowired
	private accountRepository repositoryAccount;

	@Override
	public Flux<account> findAll() {
		return repositoryAccount.findAll();
	}

	@Override
	public Mono<account> save(account account) {
		return repositoryAccount.save(account);
	}

	@Override
	public Mono<account> update(account account) {
		return repositoryAccount.save(account);
	}

	@Override
	public Mono<Void> delete(account account) {
		return repositoryAccount.delete(account);
	}

}
