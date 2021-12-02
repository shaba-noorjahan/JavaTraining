package com.shaba.training;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 a=new Test9();
		a.add(8,9);
	}
	public void add() {
		System.out.println("add method");
		int a=10;
		int b=20;
		int c=a+b;
	}
	public void add(int a) {
		System.out.println("int add method");
		
	}
	
    public void add(String a) {
	System.out.println("String add method");
	}
     public void add(int a,int b) {
    	 System.out.println("2 int add method");
     }
}
