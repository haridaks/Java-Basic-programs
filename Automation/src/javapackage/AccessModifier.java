package javapackage;


class AM{
	public int a=5;
	protected int b = 10;
	int c = 15;  //default modifier
	private int d = 20;
	
	public void testq() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
}
public class AccessModifier {

	public static void main(String[] args) {
	
		// Using all access modifier concepts
		AM obj = new AM();
		//obj.testq();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		// Private is not accessible outside the class
		// System.out.println(obj.d); 
	}

}
