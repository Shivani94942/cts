package com.mycompany.hibernateclassmappingtacleperclass;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regular_employee")
public class RegularEmployee extends Employee{

	private int experience;
	private double regularPay;
	
	public RegularEmployee(String firstName, String lastName, LocalDate joiningDate, double salary, int experience,
			double regularPay) {
		super(firstName, lastName, joiningDate, salary);
		this.experience = experience;
		this.regularPay = regularPay;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getRegularPay() {
		return regularPay;
	}

	public void setRegularPay(double regularPay) {
		this.regularPay = regularPay;
	}
	
	
	
	
}
