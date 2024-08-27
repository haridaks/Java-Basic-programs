package javapackage;

import java.util.Scanner;

public class SwitchCaseBreak {

	public static void main(String[] args) {
		// Java Program to check the size
		// using the switch...case statement

		    int number = 44;
		    String size;

		    // switch statement to check size
		    switch (number) {

		    case 29: size = "Small";
		        break;

		      case 42:
		        size = "Medium";
		        break;

		      // match the value of week
		      case 44:
		        size = "Large";
		        break;

		      case 48:
		        size = "Extra Large";
		        break;
		      
		      default:
		        size = "Unknown";
		        break;

		    }
		    System.out.println("Size: " + size);
		  }
		}
