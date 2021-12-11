package com.shaba.dec10;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashMap<String, String> map=new HashMap<String, String>();
		
		
		map.put("Tim", "45");
		map.put("Sim", "56");
		map.put("Jim", "34");
		map.put("Rim", "75");
        System.out.println(map);
        
        //no order is maintained in printing
	
	for(Map.Entry m:map.entrySet()) {
		
		System.out.println(m.getKey());
		System.out.println(m.getValue());

}
	}
}
	
