package com.waleed.training.places;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waleed.training.users.User;

@RestController
public class PlaceController {
	
	@Autowired
	PlaceService service;
	
	@RequestMapping("/users/{id}/places") //Get all places based on a user
	Iterable<Place> getAllUsers(@PathVariable Integer id){
		return service.getAllPlaces(id);
	}
	
	@RequestMapping("/places/{id}")
	Optional<Place> getUserById(@PathVariable int id){
		return service.getPlaceById(id);
	}
	
	
//	For adding a place by Post: first add a User variable in Place and generate the getters and setters
	@RequestMapping(method = RequestMethod.POST, value = "/users/{userId}/places")
	void addUser(@RequestBody Place place, @PathVariable Integer userId) {
		place.setUser(new User(userId, "", "")); // Before saving a new place, we have to set the user to that place
		service.addPlace(place);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{userId}/places")
	void updatePlace(@RequestBody Place place, @PathVariable Integer userId) {
		place.setUser(new User(userId, "", ""));
		service.updatePlace(place);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/places/{id}")
	void deleteUser(@PathVariable int id) {
		service.deletePlace(id);
	}
	
	
	
	
	
	
	
	

}
