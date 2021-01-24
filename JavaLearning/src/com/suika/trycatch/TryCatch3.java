package com.suika.trycatch;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Steven Coffee
 * This program reads a file and then copies the file
 * to another one byte by byte. This tests out different 
 * use cases for a try-catch block.
 */
public class TryCatch3 {
	public static void main(String[] args) {
		File fileIn;
		FileInputStream fileInStrm;
		DataInputStream dataInStrm = null;
		
		File fileOut;
		FileOutputStream fileOutStrm;
		DataOutputStream dataOutStrm = null;
		
		/*
		 * This checks to see if it could find a 
		 * file by the name of input and also check. 
		 */
		try {
			fileIn = new File("input");
			fileInStrm = new FileInputStream(fileIn);
			dataInStrm = new DataInputStream(fileInStrm);
		} catch(FileNotFoundException e) {
			System.out.println("Hello");
		}
		
		try {
		fileOut = new File("output.txt");
		fileOutStrm = new FileOutputStream(fileOut);
		dataOutStrm = new DataOutputStream(fileOutStrm);
		} catch(FileNotFoundException e) {
			System.out.println("Hi");
		}
		
		int numFilesCopied = 0;
		
		try {
			while(true) {
				dataOutStrm.writeByte(dataInStrm.readByte());
			}
		} catch(EOFException e) {
			numFilesCopied = 1;
		} catch(IOException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Number of files copied: " + numFilesCopied);
	}
}
