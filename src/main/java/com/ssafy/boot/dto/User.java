package com.ssafy.boot.dto;

public class User {
	
	// user object
	private String userName;
	private int userAge;
	private String userGender;
	
	
	public User(String userName, int userAge, String userGender) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	// user getter setter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAge=" + userAge + ", userGender=" + userGender + "]";
	}
	
}
