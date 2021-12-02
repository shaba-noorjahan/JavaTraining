package com.shaba.training;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 b=new Test4();
		Test4 a=new Test4("hi",5);
		b.display("di");
		
		}
	Test4(){
		System.out.println("default");
		
	}
	Test4(String name,int num){
		System.out.println(name);
		
	}
	public void display (String name) {
		System.out.println(name);
	}
}
