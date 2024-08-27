package javapackage;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if ((a+b) > (c+d)) {
		System.out.println("The Sum Of A and B Is Greater Than C and D");
	   }
    }
	
}
