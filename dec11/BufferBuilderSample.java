package com.shaba.dec11;

public class BufferBuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Buffer and Builder
		
		StringBuffer buffer1=new StringBuffer("Hello");
		StringBuffer buffer2=new StringBuffer("Hi");
		buffer1.append("Good");
		System.out.println(buffer1);
	
		System.out.println(buffer1.compareTo(buffer2));
		
		buffer1.delete(0, 5);
		System.out.println(buffer1);
		
		System.out.println(buffer1.indexOf("G"));
		
		buffer1.insert(0, "test");
		System.out.println(buffer1);
		
		buffer1.replace(0, 4, "happy");
		System.out.println(buffer1);
		
		System.out.println(buffer1.reverse());
		
		;
		System.out.println(buffer1.substring(1));
		
		

	}

}
