package javapackage;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = obj.nextInt();
		int b= 5;
		int c=10;
		//Do not leave space between + and = follow same for all conditions
		a+=3; //a= given num + 3 (if 10 then, 10+3 = 13)
				System.out.println(a);
		a-=3; //(if 10 is the number then, 10-3 = 7)
		        System.out.println(a);
		a*=4;        
		System.out.println(a);
		a/=5;
		System.out.println(a);
		a%=5;
		System.out.println(a);
		 
		System.out.println(a>b && b<c); // true and false so o/p will be false
	}

}
