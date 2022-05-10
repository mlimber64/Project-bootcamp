package com.nttdata.bootcamp.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.proyecto.model.accountType;
import com.nttdata.bootcamp.proyecto.service.accountTypeService;

import lombok.Builder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/v1/accountType" )
public class accountTypeController {
	
	@Autowired
	private accountTypeService serviceAccountType;
	
	@GetMapping()
	@ResponseBody
	public Flux<accountType> findAll(){
		return this.serviceAccountType.findAll();
	}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<accountType> createType(@RequestBody accountType account){
		return serviceAccountType.save(Mono.just(account));
	}
	
	
	@PostMapping("/update")
	public ResponseEntity<Mono<accountType>> updateAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<accountType>>(serviceAccountType.update(accountType),HttpStatus.OK);
	}
//	
//	@DeleteMapping("/delete/{id}")
//	public Mono<ResponseEntity<Void>> deleteId(@PathVariable("id") String id){
//		return serviceAccountType.delete(id)
//				.map(r-> ResponseEntity.ok().<~> build())
//				.defaultIfEmpty(ResponseEntity.notFound().build());
//	}
//	
//	@DeleteMapping("/delete")
//	public ResponseEntity<Mono<Void>> deleteAccountType(@RequestBody accountType accountType){
//		return new ResponseEntity<Mono<Void>>(serviceAccountType.delete(accountType),HttpStatus.OK);
//	}
	
//	@DeleteMapping("/routes/{id}")
//	public Mono<ResponseEntity<Object>> delete(@PathVariable String id) {
//	  return this.routeDefinitionWriter.delete(Mono.just(id))
//	      .then(Mono.defer(() -> Mono.just(ResponseEntity.ok().build())))
//	      .onErrorResume(t -> t instanceof NotFoundException, t -> Mono.just(ResponseEntity.notFound().build()));
//	}

}
