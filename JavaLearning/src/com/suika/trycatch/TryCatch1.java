package com.suika.trycatch;

import java.util.Scanner;

/**
 * 
 * @author Steven Coffee
 * This program gets exactly five words from the user 
 * and then displays the length of each word.
 */
public class TryCatch1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // used to get user input
		String[] words = new String[5]; // Array that has exactly five elements. 
		
		int i = 0; // this variable is used as a counter.
		
		/*
		 * This statement is in a try-catch because if the user does not enter
		 * "Quit" before the array gets to a sixth entry the program would crash
		 * instead this program tells the user the array is full.
		 */
		try {
			do {
			words[i] = keyboard.next();
			
			}while(!words[i++].equals("Quit"));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You can enter at most five words");
		}
		
		/*
		 * This for loop traverses the array and prints out the length
		 * of each word that was entered by the user. It uses a try-catch 
		 * statement in case the user entered quit before filling up the 
		 * array. If that's the case the program will tell the user they 
		 * could've entered five words.
		 */
		for(int j = 0; j < 5; j++) {
			try {
				System.out.println(words[j].length());
			} catch(NullPointerException e) {
				System.out.println("You could have entered up to five words");
			}
		}
		keyboard.close();
	}
}
