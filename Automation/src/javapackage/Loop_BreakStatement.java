package javapackage;

public class Loop_BreakStatement {

	public static void main(String[] args) {
    for(int i=1; i<=10; i++) {
    	if(i==4) {
    		continue; //continue statement is used to skip the element
    	}
    	if(i==9) {
        break; //break statement is used break(stop the o/p) the element
    	}
    	System.out.println(i); 

    }
    
	}

}
