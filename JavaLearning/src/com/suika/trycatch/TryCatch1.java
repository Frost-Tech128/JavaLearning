package com.suika.trycatch;

import java.util.Scanner;

public class TryCatch1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] words = new String[5];
		
		boolean go = true;
		int i = 0;
		do {
			try {
				words[i] = keyboard.next();
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayFull");
				go = false;
			}
		} while (go && !words[i++].equals("Quit"));
		
		for(int j = 0; j < 5; j++) {
			System.out.println(words[j].length());
		}
		keyboard.close();
	}
}
