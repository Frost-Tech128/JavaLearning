package com.suika.main;
import java.util.ArrayList;

import com.suika.lambdapractice.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		Integer num1 = 42;
		Integer num2 = 35;
		System.out.println(num1 + num2);
		ArrayList<Double> numList = new ArrayList<>();
		numList.add(3.1);
		numList.add(3.5);
		numList.add(4.6);
		numList.add(6.8);
		numList.add(2.2);
		System.out.println(ArrayListAverage.getAverage(numList));
	}

}
