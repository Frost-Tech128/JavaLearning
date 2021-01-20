package com.suika.lambdapractice;

import java.util.ArrayList;

public class ArrayListAverage 
{
	ArrayList<Double> numList;
	
	public ArrayListAverage(ArrayList<Double> numList) {
		this.numList = numList;
	}
	
	public double getAverage(){
		return (numList.stream().reduce(0.0, (num1, num2) -> num1 + num2)) 
				/ (numList.stream().count());
	}

}
