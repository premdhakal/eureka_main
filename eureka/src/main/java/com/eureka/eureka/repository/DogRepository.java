package com.eureka.eureka.repository;

import org.springframework.data.repository.CrudRepository;

import com.eureka.eureka.entity.DogEntity;


public interface DogRepository extends CrudRepository<DogEntity, Long> {

	//@Query("select d.id, d.breed from DogEntity d where d.id=:id")
	//String findBreedById(Long id);
}