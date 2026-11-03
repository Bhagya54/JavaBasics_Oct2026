package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	/*
	 * xyz book
	 * Not handling the exception
	 * 1.terminating your program
	 * 2.error - not readable
	 * 
	 */

	public static void main(String[] args) throws IOException   {
	  FileReader fr = new FileReader("./src/day13/demo");
	  fr.read();
	  System.out.println("hello");
	  System.out.println("hello");
	  System.out.println("hello");

	}

}
