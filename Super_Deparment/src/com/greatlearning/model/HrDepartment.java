package com.greatlearning.model;

public class HrDepartment extends Superdeparment {

	String departmentName = "HR Department";
	String getTodaysWork = "Fill today’s timesheet and mark your attendance";
	String getWorkDeadline = "Complete by EOD";
	String doActivity = "team Lunch";

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

	public String doActivity() {
		System.out.println(doActivity);
		return doActivity;
	}

	public String isTodayAHoliday() {
		return super.isTodayAHoliday();
	}

}
