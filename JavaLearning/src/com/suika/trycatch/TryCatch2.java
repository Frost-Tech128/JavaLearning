package com.suika.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author suika
 *
 */
public class TryCatch2 {
	public static void main(String[] args) {
		Scanner keyboard = null;
		try {
		keyboard = new Scanner(new File("numbers"));
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
		
		int[] numerators = new int[5];
		int[] denominators = new int[5];
		
		int i = 0;
		try {
			while(keyboard.hasNextInt()) {
				numerators[i] = keyboard.nextInt();
				denominators[i] = keyboard.nextInt();
				i++;
			} 
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("list full");
		} catch(NullPointerException e) {
			
		} catch(InputMismatchException e) {
			System.out.println("only Whole numbers allowed");
		}
		keyboard.close();
		
		for (int j = 0; j < numerators.length; j++) {
			 System.out.println(numerators[j] / denominators[j]);
			 
	}
}
}