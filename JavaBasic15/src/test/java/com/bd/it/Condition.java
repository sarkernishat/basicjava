package com.bd.it;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int number2 = input.nextInt();
		
		if(number1 > number2) {
			System.out.println("The large number is number1");
		}else {
			System.out.println("The large number is number2");
		}
	}

}
