package com.shaba.dec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic Exception
			int a=10;
			int b=0;
			
			try {
			int c=a/b;
			
			System.out.println("answer is "+c);
			}
		catch (ArithmeticException ex)
		{System.out.println("Error");}
		
		//file not found exception	
			File name=new File ("Users/shazia/Desktop/filename.txt");
					try {
						Scanner s = new Scanner(name);

					} catch (FileNotFoundException e1) {

						System.out.println("no files");
					}

	}

}
