package javapackage;

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number: ");
		float a = sc.nextFloat();
		//if the given value is 10
		System.out.println(a++); //10
		System.out.println(a--); /*11(will be in backend) and it will display
		then a-- happens so 10 will be there for next operations*/
		System.out.println(a++ + a++); //10+11 = 21
		System.out.println(a++ + --a); //12 + 11 = 23
		System.out.println(--a + ++a);
		System.out.println(--a - ++a);

	}

}
