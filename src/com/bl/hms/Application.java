package com.bl.hms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		int answer = userInterface.ShowMainMenu();

		Application application = new Application();
		application.handleUserSelection(answer);
	}
	
	

	void handleUserSelection(int option) {

		switch (option) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;

		}
	}
	
	private void addDoctor() {
		Scanner scanner = new Scanner(System.in);
		Doctor doctor = new Doctor();
		System.out.println("Enter the doctor Id");
		String doctorid = scanner.next();
		System.out.println("Enter doctor name");
		String doctorName = scanner.next();
		System.out.println("Enter doctor phoneNumber");
		long doctorphoneNumber = scanner.nextLong();
		System.out.println("Enter doctor emailId");
		String doctoremailId = scanner.next();
		System.out.println("Enter doctor specialisation");
		String doctorspecialisation = scanner.next();
		
		doctor.availability = new HashMap();
		doctor.availability.put(Doctor.WeekDays.SUN, "10AM to 12 PM");
		doctor.availability.put(Doctor.WeekDays.MON, "10AM to 12 PM");
		doctor.availability.put(Doctor.WeekDays.TUE, "10AM to 12 PM");
		doctor.availability.put(Doctor.WeekDays.WED, "10AM to 12 PM");
		doctor.availability.put(Doctor.WeekDays.TUE, "10AM to 12 PM");
		doctor.availability.put(Doctor.WeekDays.FRI, "10AM to 12 PM");
		doctor.availability.put(Doctor.WeekDays.SAT, "10AM to 12 PM");
		
		DoctorRepo doctorRepo = new DoctorRepo();
		doctorRepo.add(doctor);

				
	}
}
