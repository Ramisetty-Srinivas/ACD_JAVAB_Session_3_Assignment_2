package session3_assignment2; //package declaration

	/*
	 * The this() constructor call can be used to invoke the current class constructor. 
	 * It is used to reuse the constructor. In other words, it is used for constructor chaining.
	 */

public class ThiscurrentClassConstructor {
	
	ThiscurrentClassConstructor(){
		System.out.println("Hello a");
	}
	
	ThiscurrentClassConstructor(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		ThiscurrentClassConstructor k = new ThiscurrentClassConstructor(10);
		
	}

}
