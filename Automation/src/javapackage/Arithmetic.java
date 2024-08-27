package javapackage;

import java.util.Scanner;

public class Arithmetic {

		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			float num1 = obj.nextFloat();
			System.out.println("Enter the second number: ");
			float num2 = obj.nextFloat();
			System.out.println("Addition of two number is:" + (num1+num2));
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2); //will return the quotient value
			System.out.println(num1%num2); //will return the remainder value
			
			
		}

	}



