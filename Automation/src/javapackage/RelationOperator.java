package javapackage;

import java.util.Scanner;

public class RelationOperator {

	public static void main(String[] args) {
		// Java has 6 Relational operators it compares 2 numbers and return boolean value
		// Relational Operators are (< , > , <=, >=, ==, !=)
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(); //if 10
		float b = sc.nextFloat(); //if 20
		System.out.println(a > b); // false
		System.out.println(a<b); //true
		System.out.println(a >= b); //false
		System.out.println(a <= b); //true
		System.out.println(a == b); //false
		System.out.println(a != b); //true
				
	}

}
