package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead_ExceptionHandling {
	/*
	 * xyz book Not handling the exception 
	 * 1.terminating your program 
	 * 2.error - not readable
	 * 
	 */

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./src/day13/demo1");
		} catch (FileNotFoundException e) {
			System.out.println("File is not present at this location" + e);
		}
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");

	}

}
