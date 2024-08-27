package javapackage;

public class LoopFor_ToPrint5_5Pattern {

	public static void main(String[] args) {
		/* ****
		   ****
		   ****
		   ****
		 */
		System.out.println("Pattern using For loop");
    for(int line=1; line<=4; line++) 
    {
    	System.out.println("****");
    }
    System.out.println("Pattern using While loop");
    //same program using while loop here i'm using 
    //initiation,condition,updation seperately
    int line=1;
    while(line<=4) {
    	System.out.println("****");
    	line++;
    }
	}

}
