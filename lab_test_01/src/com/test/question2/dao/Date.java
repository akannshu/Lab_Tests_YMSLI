package com.test.question2.dao;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day = date.getDay();
		this.month = date.getMonth();
		this.year = date.getYear();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("The date is: " + this.day + "/" + this.month + "/" + this.year);
	}
	
	public void input() {}
	
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
