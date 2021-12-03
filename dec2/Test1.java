package com.shaba.dec2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		
		t.launch("chrome");
		t.launch("firefox");
		t.launch("edge");
		t.launch("");
		
	}
	public void launch (String browser) {
		String url="";
		switch (browser) {
		case "chrome":
			url = "chrome url";
			System.out.println(url);
			break;
		
		case "firefox":
		     url ="firefox url";
		     System.out.println(url);
		     break;
		     
		case "edge":
			url ="edge url";
			System.out.println(url);
			break;
		
		default:
			System.out.println("default msg");
			break;
		     
		}
		}
		
		
		
				

	}


