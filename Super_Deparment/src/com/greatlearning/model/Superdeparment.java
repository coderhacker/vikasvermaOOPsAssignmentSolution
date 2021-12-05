package com.greatlearning.model;

public class Superdeparment {

	/**
	 * Declare departmentName , getTodaysWork , getWorkDeadline, isTodayAHoliday
	 */

	String departmentName = "Super department";
	String getTodaysWork = "No Work as of now";
	String getWorkDeadline = "Nil";
	String isTodayAHoliday = "Today is not a holiday";

	public String departmentName() {
		System.out.println("Welcome to " + departmentName);
		return departmentName;
	}

	public String getTodaysWork() {
		System.out.println(getTodaysWork);
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		System.out.println(getWorkDeadline);
		return getWorkDeadline;
	}

	public String isTodayAHoliday() {
		System.out.println(isTodayAHoliday);
		return isTodayAHoliday;
	}

}
