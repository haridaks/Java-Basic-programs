package javapackage;

public class Swapping2 {

	public static void main(String[] args) {
		// Define two variables
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values using addition and subtraction
        a = a + b; // Store the sum of a and b in a
        b = a - b; // Assign (a + b) - b to b, which effectively gives a's original value
        a = a - b; // Assign (a + b) - a to a, which effectively gives b's original value

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
