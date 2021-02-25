package com.test.question2;

public class Owner {

	private String name, nic;
	private Date date_of_birth;

	public Owner(String name, String nic, Date date_of_birth) {
		super();
		this.name = name;
		this.nic = nic;
		this.date_of_birth = date_of_birth;
	}

	public Owner() {
	};

	public Owner(Owner owner) {
	}

	public void input() {
	};

	public void print() {
	};

	@Override
	public String toString() {
		return "Owner [name=" + name + ", nic=" + nic + ", date_of_birth=" + date_of_birth + "]";
	};

}
