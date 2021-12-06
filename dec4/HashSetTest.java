package dec4;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		System.out.println(set.size());
		
		set.add("Alice");
		set.add("Lynn");
		set.add("ellana");
		set.add("Eva");
		set.add("Ann");
		set.add("April");
		
		System.out.println(set.size());
		
		for (String a:set) {
			System.out.println(a);
			
		}
		

	}

}
