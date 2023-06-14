package com.greatlearning;
import com.greatlearning.SuperDepartment;

public class DriverClass {
	public static void main(String[] args) {
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();

		// Displaying functionalities of HR Department
		System.out.println("Department: " + hrDepartment.departmentName());
		System.out.println("Todays Work: " + hrDepartment.getTodaysWork());
		System.out.println("Work Deadline: " + hrDepartment.getWorkDeadline());
		System.out.println("Activity: " + hrDepartment.doActivity());
		System.out.println("Today's Holiday: " + hrDepartment.isTodayAHoliday());

		System.out.println("-----------------------------------");

		// Displaying functionalities of Tech Department
		System.out.println("Department: " + techDepartment.departmentName());
		System.out.println("Todays Work: " + techDepartment.getTodaysWork());
		System.out.println("Work Deadline: " + techDepartment.getWorkDeadline());
		System.out.println("Tech Stack: " + techDepartment.getTechStackInformation());
		System.out.println("Today's Holiday: " + techDepartment.isTodayAHoliday());

		System.out.println("-----------------------------------");

		// Displaying functionalities of Admin Department
		System.out.println("Department: " + adminDepartment.departmentName());
		System.out.println("Todays Work: " + adminDepartment.getTodaysWork());
		System.out.println("Work Deadline: " + adminDepartment.getWorkDeadline());
		System.out.println("Today's Holiday: " + adminDepartment.isTodayAHoliday());
	}
}

