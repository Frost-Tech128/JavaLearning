package com.suika.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Steven Coffee
 * This program reads integers from a file and then 
 * saves the integers in two separate arrays both the 
 * having a size of five elements. Then it goes on to display 
 * the integer in the first array divided by the integer in 
 * the second array in the corresponding index.
 */
public class TryCatch2 {
	public static void main(String[] args) {
		Scanner diskScanner = null;
		
		/*
		 * This initializes the Scanner object and passes in 
		 * a file object with the name "numbers" Surrounded by
		 * a try-catch block in the case the file is not
		 * found.
		 */
		try {
			diskScanner = new Scanner(new File("numbers"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int[] numerators = new int[5];
		int[] denominators = new int[5];
		
		int i = 0;
		
		/*
		 * This reads the file and saves the integers to 
		 * both of the arrays. This is in a try-catch block in 
		 * the event that The array gets full, The number in the
		 * file is not an integer, and in the case that
		 * the Scanner object was not initialized.
		 */
		try {
		while(diskScanner.hasNextInt()) {
			numerators[i] = diskScanner.nextInt();
			denominators[i] = diskScanner.nextInt();
			i++;
		}} catch(InputMismatchException e) {
			System.out.println("Only integers please.");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Max inputs allowed is five.");
		} catch(NullPointerException e) {
			System.out.println("File not found");
		}
		
		/*
		 * Traverses each array dividing corresponding indexes
		 * and then prints it out. This will catch a number being 
		 * divided by zero.
		 */
		for(int j = 0; j < numerators.length; j++) {
			try {
				System.out.println(numerators[j] / denominators[j]);
			} catch(ArithmeticException e) {
				System.out.println("Divide by zero on array index" + j);
			}
		}
		
		/*
		 * In the case the Scanner object was not initialized
		 * this catches the null pointer.
		 */
		try{
			diskScanner.close();
		} catch(NullPointerException e) {
			System.out.println("file not found");
		}
}
}