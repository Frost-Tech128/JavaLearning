package com.suika.lambdapractice;

import java.util.ArrayList;

public class ArrayListAverage 
{
	
	
	public static double getAverage(ArrayList<Double> numList){
		return (numList.stream().reduce(0.0, (num1, num2) -> num1 + num2)) 
				/ (numList.stream().count());
	}

}
