package com.bd.it;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		//print method
		System.out.println("Hey Gobindo, You are everything");
		
		//Scan
		//Object => ClassName objName = new ClassName(Parameter);
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		int number = input.nextInt();
		double number2 = input.nextDouble();
		System.out.println("Your name is "+name+" You have gotten: "+number);
		
		//Output formatting
	}
 
}
