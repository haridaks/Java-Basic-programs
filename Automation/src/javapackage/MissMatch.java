package javapackage;

import java.util.Scanner;

public class MissMatch {

	public static void main(String[] args) {
		
		System.out.println("Enter the name: ");
		Scanner sc = new Scanner(System.in);
		try{ 
        int a = sc.nextInt();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("datatype should be string");
		}
		
		
	}

}
