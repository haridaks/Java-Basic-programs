package javapackage;

public class Loop_ToPrint1to10 {

	public static void main(String[] args) {
	//Writing loop to print numbers 1 to 10
		
		int counter = 1; //initiating
		while(counter<=10) //conditioning
		{
			System.out.println(counter); //printing the counter value itself
			//System.out.print(counter+" "); //if we want in one line
			counter++; //after printing 1 it will increment so, 2..3..4....10
		}
	}

}
