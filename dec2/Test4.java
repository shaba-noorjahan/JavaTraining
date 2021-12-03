package com.shaba.dec2;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 0; i <= 10; i++) {

			System.out.println("i value is: " + i);

			sum += i;
			if (sum == 3) {
				System.out.println("inside if");
				break;
			}
			System.out.println("sum value is: " + sum);

		}
		

	}

}
