package com.shaba.training;

public class TestAb2 extends TestAbstract {
	
	public static void main (String[] args) {
		
		TestAb2 a= new TestAb2();
		TestAb3 b= new TestAb3();
		
		b.read();
		
	a.display();
	b.display();
		a.read();
		
	}
	@Override
	
	public void display() {
	System.out.println("zzzzzz");
	}

}
