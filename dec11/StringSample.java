package com.shaba.dec11;

import java.util.Scanner;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x1="",x2 ="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		x1=sc.nextLine();
		x2=sc.nextLine();
		
		int l1=x1.length();
		int l2=x2.length();
		
		System.out.println("x1 length = "+l1);
		System.out.println("x2 length = "+l2);
		
		String y= x1 + x2;
		System.out.println("Concatination = " +y);
		System.out.println("concatination using method " +x1.concat(x2));
		System.out.println(x1.concat(x2));
		System.out.println(x1.codePointAt(0));
		//System.out.println(x1.char(1));
		
		
		String a = "abcabcaaa";
		String b = "ABC";
		String c = "    zzzz    ";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		//System.out.println(a.indexOf(0));
		System.out.println(a.indexOf("b"));
		System.out.println(a.indexOf("bc"));
		
		System.out.println(a.indexOf('a',2));
		System.out.println(a.indexOf("bc",3));
		System.out.println(a.lastIndexOf("bc"));

		System.out.println(a.lastIndexOf('a'));
		System.out.println(a.replace('a','z'));  //replace old char with new
		System.out.println(a.split("abc")[0]); // split String a
		System.out.println(a.substring(0, 5)); //substring beg-end
		System.out.println(b.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(c.trim()); //trims space
		System.out.println(a.valueOf(2));
		}

}
