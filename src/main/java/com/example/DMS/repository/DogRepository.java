package com.example.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DMS.models.Dog;
@Repository
public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);

}
