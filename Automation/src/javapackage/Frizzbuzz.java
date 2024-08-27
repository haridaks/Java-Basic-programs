package javapackage;

import java.util.Scanner;

public class Frizzbuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer: ");
		
		int num = sc.nextInt();
		
		
		
		if(num%3 == 0 || num%5 == 0) {
			
			System.out.println("Frizzbuzz");
			
		
		
		   if (num%3 == 0 || num%5 != 0) {
			
			System.out.println("Frizz");
			
		
			if(num%3 != 0 || num%5 == 0) {
			
			System.out.println("buzz");
			
		}
       if(num%3 != 0 || num%5 != 0) {
			
			System.out.println(num);
			
		}
			}
		}

	}

}
