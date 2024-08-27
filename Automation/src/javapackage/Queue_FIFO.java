package javapackage;

import java.util.ArrayDeque;

public class Queue_FIFO {

	public static void main(String[] args) {
	  ArrayDeque<Integer> Num = new ArrayDeque<>();
	 
	 Num.add(10);
	 Num.add(20);
	 Num.add(30);
	 System.out.println(Num);
	 Num.pop(); //can be done with remove also
	 System.out.println(Num);
	 Num.pop();
	 System.out.println(Num);
	 
	}

}
