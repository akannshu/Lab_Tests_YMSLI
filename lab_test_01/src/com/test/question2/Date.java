package com.test.question2;

public class Date {
	
	private int day,month,year;
	
	public Date(){}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	};
	
	public Date(Date d) {};
	
	public void input() {};
	public void print() {}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	};
	
	
	 
	 
}
