package com.shaba.dec10;

import java.util.ArrayList;


public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating array list
		ArrayList<String> state=new ArrayList<String>();
		
		System.out.println(state.size());
		
		//adding item to array list manually
		state.add("Georgia");
		state.add("California");
		state.add("NewYork");
		state.add("Florida");
		
	   //adding items to array list using for loop
	    for(int i=0;i<10;i++) {
			state.add(" "+i);
			
		}
		state.add("10");
		state.add("10");
		state.add("10");
		state.add("10");
		//printing the array list using for loop
		System.out.println(state.size());
		for(int i=0;i<state.size();i++) {
			System.out.println(state.get(i));
			
		}
		//printing state using enhanced for loop
		for(String a:state) {
			System.out.println(a);
		}
		

	}

}
