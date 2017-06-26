package session3_assignment2;

/*
 * The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. 
 * In other words, it is used if method is overridden
 */


public class SuperParentClassMethodTest extends SuperParentClassMethod{
	
	void eat(){
		System.out.println("Eating bread ...");
	}
	
	void bark(){
		System.out.println("Barking ...");
	}
	
	void work(){
		super.eat();
		bark();
	}

	public static void main(String[] args) {
		
		SuperParentClassMethodTest k = new SuperParentClassMethodTest();
		k.work();
	}

}
