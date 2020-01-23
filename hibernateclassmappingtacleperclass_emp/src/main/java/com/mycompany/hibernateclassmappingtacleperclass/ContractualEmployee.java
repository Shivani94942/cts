package com.mycompany.hibernateclassmappingtacleperclass;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractual_employee")

public class ContractualEmployee extends Employee{
	
	private int contractPeriod;
	private double contractPay;
	
	
	public ContractualEmployee(String firstName, String lastName, LocalDate joiningDate, double salary,
			int contractPeriod, double contractPay) {
		super(firstName, lastName, joiningDate, salary);
		this.contractPeriod = contractPeriod;
		this.contractPay = contractPay;
	}


	public int getContractPeriod() {
		return contractPeriod;
	}


	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}


	public double getContractPay() {
		return contractPay;
	}


	public void setContractPay(double contractPay) {
		this.contractPay = contractPay;
	}
	
	
	
	

	
	
}
