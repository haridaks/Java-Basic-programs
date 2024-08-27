package javapackage;

public class Loop_DoWhile {

	public static void main(String[] args) {
		/* do {
		 executable code
		 } while();
		 */
		//In do while loop unlike other loop conditions or if condition
		//it will execute the statement atleast once
		int i=1;
		do {
			System.out.println("Hello"); 
			i++;
		}
	while(false); //even though the condition is false it will execute one time
		          //unlike other conditions semicolon is used for this while
	}
	
}
