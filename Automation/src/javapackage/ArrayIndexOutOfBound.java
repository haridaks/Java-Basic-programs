package javapackage;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			a[5] = 10;	
		}
catch(Exception e) {
	e.printStackTrace();
}
		finally {
			System.out.println("length of the array");
		}
	
				
	}

}
