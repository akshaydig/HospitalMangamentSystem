package com.bl.hms;

import java.util.Map;

public class Doctor {
	
	enum WeekDays{
		SUN, MON, TUE, WED, THU, FRI, SAT 
	}
	
	String name;
	String specialisation;
	long mobileNumber;
	String emailId;
	String id;
	Map<WeekDays, String> availability;
}