package javapackage;

import java.util.Scanner;

public class Loop_ToPrint1ton {

	public static void main(String[] args) {
//Program to print 1 to n(user value)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("The values are: ");
		int counter = 1;
		while(counter <= n) {
			System.out.println(counter);
			counter++;
		}
		
		
	}

}
