package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.*;

public class Driver {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Choose your department");
		System.out.println("1. Admin Department");
		System.out.println("2. HR Department");
		System.out.println("3. Tech Department");
		System.out.println("4. Super Department");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			// create an object
			AdminDepartment ad = new AdminDepartment();
			ad.departmentName();
			ad.getTodaysWork();
			ad.getWorkDeadline();
			ad.isTodayAHoliday();
			break;
		case 2:
			// create an object
			HrDepartment hr = new HrDepartment();
			hr.departmentName();
			hr.doActivity();
			hr.getTodaysWork();
			hr.getWorkDeadline();
			hr.isTodayAHoliday();
			break;
		case 3:
			// create an object
			TechDepartment tc = new TechDepartment();
			tc.departmentName();
			tc.getTodaysWork();
			tc.getWorkDeadline();
			tc.isTodayAHoliday();
			break;
		case 4:
			// create an object
			Superdeparment su = new Superdeparment();
			su.departmentName();
			su.getTodaysWork();
			su.getWorkDeadline();
			su.isTodayAHoliday();
			break;
		default:
			System.out.println("Please choose correct Department");
			return;
		}

	}

}
