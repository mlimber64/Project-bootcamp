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
	public Mono<account> save(account a) {
		return repositoryAccount.save(a);
	}

	@Override
	public Mono<account> update(String id ,account a) {
		return repositoryAccount.findById(id)
				.flatMap(ac -> {
					a.setId(id);
					return save(a);
				})
				.switchIfEmpty(Mono.empty());
	}

	@Override
	public Mono<account> delete(String id) {
		return repositoryAccount.findById(id)
				.flatMap(delete -> repositoryAccount.delete(delete)
						.then(Mono.just(delete)));
	}

}
