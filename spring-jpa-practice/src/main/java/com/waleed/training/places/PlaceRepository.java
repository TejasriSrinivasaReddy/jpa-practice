package com.waleed.training.places;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Integer>{
	
	
	 List<Place> findByUserUserId(Integer id); // For getting all the places for a particular user : by id
}
