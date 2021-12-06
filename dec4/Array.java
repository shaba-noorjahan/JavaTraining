package dec4;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
System.out.println(list.size());

list.add("Tom");
list.add("Sam");
list.add("Sim");
list.add("Jim");

for (int i=0;i<10;i++) {
	list.add(""+i);
}
System.out.println(list.size());

	
for (String a:list) {
	System.out.println(a);
	
}
}
}