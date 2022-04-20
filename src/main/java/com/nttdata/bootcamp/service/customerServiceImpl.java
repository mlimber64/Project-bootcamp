package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.model.customer;
import com.nttdata.bootcamp.repository.customerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class customerServiceImpl implements customerService{
	
	@Autowired
	private customerRepository repositoryCustomer;

	@Override
	public Flux<customer> findAll() {
		return repositoryCustomer.findAll();
	}

	@Override
	public Mono<customer> save(customer customer) {
		return repositoryCustomer.save(customer);
	}

	@Override
	public Mono<customer> update(customer customer) {
		return repositoryCustomer.save(customer);
	}

	@Override
	public Mono<Void> delete(customer customer) {
		return repositoryCustomer.delete(customer);
	}

}
