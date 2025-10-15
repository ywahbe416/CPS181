
public class InterfacePracticePgm {

	public static void main(String []args) {
		
		compute c1 = new compute();
		c1.print(); // calls the print method within the compute class.
		
		int sum = c1.add(7,4);
		int difference = c1.subtract(7,6);
		
		System.out.println("The sum of the 2 numbers is: " + sum);
		System.out.println("The difference between the 2 numbers is: " + difference);
		
		
	}
	
	
}


interface Calculator{
	int add(int a, int b); //these methods are abstract by default, 
	int subtract(int a, int b); //so no need to add abstract.
	
	// Concrete method/non abstract method. 
	// You cant use these in an interface.
	/*
	 * void print(){}
	 */
	
	// default method to go for a concrete method in an interface.
	
	default void print() {
		System.out.println("Have a good day.");
	}
}

class compute implements Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	// Overriding the default print method which is written within the interface.
	public void print() {
		System.out.println("Good afternoon!");
	}
}