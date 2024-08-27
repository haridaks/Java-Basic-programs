package javapackage;

import java.util.Stack;

public class Stack_LIFO {

	public static void main(String[] args) {
	Stack<Integer> Number = new Stack<>();
	
	//pushing 3 integers  
	Number.push(1);
	Number.push(2);
	Number.push(3);
	System.out.println(Number);
	
	//LIFO
	Number.pop();
	System.out.println(Number);

}}
