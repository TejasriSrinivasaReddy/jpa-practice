package com.waleed.training.places;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.waleed.training.users.User;

@Entity
public class Place {
	
	@Id
	Integer placeId;
	
	public Place(Integer placeId, String placeName, String placeDetails, Integer userId) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeDetails = placeDetails;
		this.user = new User(userId, "", "");
	}
	
	Place(){
		
	}

	String placeName;
	
	String placeDetails;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	User user; // Tie this place to a particular user, Foreign Key to the Primary Key in User table

	

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceDetails() {
		return placeDetails;
	}

	public void setPlaceDetails(String placeDetails) {
		this.placeDetails = placeDetails;
	}
	
}

	
