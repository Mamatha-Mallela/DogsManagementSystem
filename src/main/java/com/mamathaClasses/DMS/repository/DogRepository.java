package com.mamathaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mamathaClasses.DMS.Models.Dog;

/** 
 * 
 * @author Mamatha Mallela s555620
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);
}
