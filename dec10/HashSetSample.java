package com.shaba.dec10;

import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> set=new HashSet<String>();
    System.out.println(set.size());
    
    set.add("apple");
    set.add("mango");
    set.add("cherry");
    set.add("berry");
    set.add("peach");
    set.add("plum");
    set.add("lemon");
    set.add("apple");// hash set prints only unique value
    set.add("apple");
    set.add("apple");
    
    
    System.out.println(set.size());
    
    for(String a:set) {
    	System.out.println(a);
    	
    }
    
		
		
	}

}
