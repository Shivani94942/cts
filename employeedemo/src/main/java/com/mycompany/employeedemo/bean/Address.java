package com.mycompany.employeedemo.bean;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter

public class Address{
	private String line1;
	private String line2;
	private int zipCode;
	private int phno;
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", zipCode=" + zipCode + ", phno=" + phno + "]";
	}
	

}
