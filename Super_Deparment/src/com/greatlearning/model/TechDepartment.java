package com.greatlearning.model;

public class TechDepartment extends Superdeparment {

	String departmentName = "Tech department";
	String getTodaysWork = "Complete coding of module 1";
	String getWorkDeadline = "Complete by EOD";
	String getTechStackInformation = "core Java";

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
