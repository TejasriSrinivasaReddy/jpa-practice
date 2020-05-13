package com.waleed.training.places;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository repo;
	
	Iterable<Place> getAllPlaces(Integer id){
		return repo.findByUserUserId(id);
	}
	
//	Returns a single place by id
	Optional<Place> getPlaceById(int id){
		return repo.findById(id);
	}
	
	void addPlace(Place place) {
		repo.save(place);
	}
	
	void updatePlace(Place place) {
		repo.save(place);
	}
	
	void deletePlace(int id) {
		repo.deleteById(id);
	}

}
