package com.waleed.training.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	Integer userId;
	
	String userName;
	
	String userQualification;

	

	public User(Integer userId, String userName, String userQualification) {
		this.userId = userId;
		this.userName = userName;
		this.userQualification = userQualification;
	}
	
	User(){
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserQualification() {
		return userQualification;
	}

	public void setUserQualification(String userQualification) {
		this.userQualification = userQualification;
	}
}
