package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.bootcamp.model.customerType;
import com.nttdata.bootcamp.repository.customerTypeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class customerTypeServiceImpl implements customerTypeService{
	
	@Autowired
	private customerTypeRepository repositoryCustomerType;

	@Override
	public Flux<customerType> findAll() {
		return repositoryCustomerType.findAll();
	}

	@Override
	public Mono<customerType> save(customerType customerType) {
		return repositoryCustomerType.save(customerType);
	}

	@Override
	public Mono<customerType> update(customerType customerType) {
		return repositoryCustomerType.save(customerType);
	}

	@Override
	public Mono<Void> delete(customerType customerType) {
		return repositoryCustomerType.delete(customerType);
	}

}
