package com.bd.it;

import java.util.Scanner;

public class ConditionString {

	public static void main(String[] args) {
		
		//Scan
		Scanner input = new Scanner(System.in);
		String product1 = input.nextLine();
		String givenProduct1 = "Water Buttle";
		
		if(product1.equals(givenProduct1)) {
			System.out.println("Product1 and given product name matched");
		}else {
			System.out.println("Product1 and given product not matched");
		}
	}

}
