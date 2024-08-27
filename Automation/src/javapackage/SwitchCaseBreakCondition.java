package javapackage;

import java.util.Scanner;

public class SwitchCaseBreakCondition {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter (1 - 7) indicating day of the week: ");
	 int daynumber = sc.nextInt();
	 
	 String day;
	 
	 switch(daynumber) {
	 
	 case 1: day = "Monday"; break;
	
	 case 2: day = "Tuesday"; break;
	 
	 case 3: day = "Wednesday"; break;
	 
	 case 4: day = "Thursday"; break;
	 
	 case 5: day = "Friday"; break;
	 
	 case 6: day = "Saturday"; break;
	 
	 case 7: day = "Sunday"; break;
	 
	 default: day = "Invalid day number"; break;
	 }
	 System.out.println("The day is " +day);
	 
	 
	 }

	}


