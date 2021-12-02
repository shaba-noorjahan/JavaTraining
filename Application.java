package com.shaba.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test{
	String name;
	static String a;
}

public class Application {

	public static void main(String[] args) {

		File a = new File("Users/shazia/Desktop/filename.txt");
		int c = 10;
		int e = 0;
		String d = "a";
		
				try {
					Scanner s = new Scanner(a);
				
				} catch (FileNotFoundException e1) {
					
					System.out.println("no files");
				}
				
				try{
					c = c/e;
				}catch(ArithmeticException ex) {
				System.out.println("Arithmetic exception");
				}
				
			
			
			
		
		}
	
	}





