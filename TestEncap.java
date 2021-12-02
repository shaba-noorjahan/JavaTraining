package com.shaba.training;

public class TestEncap {
	private String name;
	private String id;
	
	public String getId() {
		return id;}
	
		public void setId(String ids) {
		id=ids;
	}

		public String getName() {
			return name;
		}
		public void setName (String name1) {
			name=name1;
		}
		private int add() {
			return 0;
		}
		public void callAdd() {
			//add();
			System.out.println(add());
		}
}
