package javapackage;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
          int marks[]=new int[100];
          //Other way int marks[]= {90,85,80};
          
          Scanner sc = new Scanner(System.in);
          System.out.println("entewr the marks");
             marks[0]=sc.nextInt(); // no neeed to give datatype here as we have mentioned it before
             marks[1]=sc.nextInt();
             marks[2]=sc.nextInt();
             System.out.println("marks of: " +marks[0]);
          
	}

}
