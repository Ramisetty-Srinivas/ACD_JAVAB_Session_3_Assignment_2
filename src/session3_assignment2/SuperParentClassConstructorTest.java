package session3_assignment2; //package declaration

/*
 * The super keyword can also be used to invoke the parent class constructor
 */

public class SuperParentClassConstructorTest extends SuperParentClassConstructor {
	
	SuperParentClassConstructorTest(){
	super();
	System.out.println("Dog is created");
	}

	public static void main(String[] args) {
		
		SuperParentClassConstructorTest k = new SuperParentClassConstructorTest();
		
	}

}
