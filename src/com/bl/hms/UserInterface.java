package com.bl.hms;

import java.util.Scanner;

public class UserInterface {
	public int ShowMainMenu() {
		System.out.println("Enter 1.Add Doctor\n 2.Delete Doctor\n 3.Update Doctor \n"
				+ " 4.Get Doctor\n 5.List All Doctor\n 6.Add Paitent\n 7.Delete Paitent\n 8.Update Paitent\n 9.Get Paitent\n"
				+ "10.List All Paitent\n 11.Add Appointment\n 12.Delete Appointment\n 13.Update Appointment \n "
				+ "14.Get Appointment\n 15.List All Appointment\n");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}
}
