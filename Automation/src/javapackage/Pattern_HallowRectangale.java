package javapackage;

public class Pattern_HallowRectangale {

	public static void main(String[] args) {
		// pattern for hallow rectangle using co-ordinates
		
		int m = 5; //for rows
		int n = 6; //for columns
		
		for (int i=1; i<=m; i++) {
			
			for(int j=1; j<=n; j++) {
				
				
				if (i == 1 || j == 1 || i == m || j == n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
