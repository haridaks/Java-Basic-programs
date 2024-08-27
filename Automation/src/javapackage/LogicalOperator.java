package javapackage;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //we can also just declare the numbers straight away here(hardcode)
		System.out.println("Enter the first number: ");
		int a = sc.nextInt(); //if a=10
		System.out.println("Enter the second number: ");
		int b = sc.nextInt(); //if b=5
		System.out.println("Enter the 3rd number: ");
		int c = sc.nextInt(); // if c = 20 
		//Logical(if first condition is false it wont check the another one)
		System.out.println(a>b && a>c); 
		//bitwise(it will check both the conditions)
		System.out.println(a<b & a<c); //false+true = false

	}

}
