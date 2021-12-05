package com.greatlearning.model;

public class AdminDepartment extends Superdeparment {

	String departmentName = "Admin Department";
	String getTodaysWork = "Complete your documents submission";
	String getWorkDeadline = "Complete by EOD";

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
		return super.isTodayAHoliday();
	}

}
