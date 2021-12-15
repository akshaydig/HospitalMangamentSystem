package com.bl.hms;

public class Patient {
	
	enum Gender { 
		MALE, FEMALE, OTHER
	}
	
	String name;
	int age;
	long mobileNumber;
	String id;
	String emailId;
	Gender gender;
	String address;
	String city;
	String disease;
}