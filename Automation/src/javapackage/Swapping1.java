package javapackage;

import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		//Program to swap girl= pink and boy = blue
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the colour1: ");
	 String colour1 = sc.nextLine();
	 System.out.println("Enter the colour2: ");
	 String colour2 = sc.nextLine();
	 
	 //Before swapping
	 System.out.println("Before swapping");
	 System.out.println("Boy = " +colour1);
	 System.out.println("Girl = " +colour2);
	 
	 //using temp variable to swap
	 String temp = colour1;
	 colour1=colour2;
	 colour2=temp;
	 
	 //After swapping
	 System.out.println("After swapping");
	 System.out.println("Boy = " +colour1);
	 System.out.println("Girl = " +colour2);
	}

}
