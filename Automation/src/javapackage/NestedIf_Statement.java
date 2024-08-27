package javapackage;

public class NestedIf_Statement {

/*Used to check condition
 * incase of nestedif statement 'if' block will exists 
 * inside another 'if' block
 * Use this when we have 2 cond = 1 solution 
 * example if age above 18 and weight above 50 are eligible for blood donation
 * Syntax: if(cond){
 * executable code
 * if(cond){
 * executable code
 * }}
 */
	public static void main(String[] args) {
     int age = 18;
	 String nationality = "Australia";
     if(age>18) {
    	 if(nationality=="India") {
    	 System.out.println("Eligible for voting");
    	 }
    	 else {
    		 System.out.println("Not eligible for voting");
    	 }
     }
    	 else {
    		 System.out.println("age must be greater than 18 and nationality should be indian");
    	 }
     }
	}


