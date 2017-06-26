package session3_assignment2;

/*
 * We can use super keyword to access the data member or field of parent class. 
 * It is used if parent class and child class have same fields.
 */


public class SuperParentClassInstanceVariableTest extends SuperParentClassInstanceVariable{
	
	String colour = "Black";
	
	void printColour(){
		System.out.println(colour); //prints colour of SuperParentClassInstanceVariable class
		System.out.println(super.colour); // prints colour of SuperParentClassInstanceVariableTest class
	}

	public static void main(String[] args) {

		SuperParentClassInstanceVariableTest k = new SuperParentClassInstanceVariableTest();
		k.printColour();
	}

}
