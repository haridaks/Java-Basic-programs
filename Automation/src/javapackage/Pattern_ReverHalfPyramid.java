package javapackage;

public class Pattern_ReverHalfPyramid {

	public static void main(String[] args) {
		// Reverse half pyramid
		
		int n = 4; //for rows
		
		//outer loop 
		
		for(int i=n; i>=1; i--) {
			
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
