package session3_assignment2; //package declaration

	/*
	 * You may invoke the method of the current class by using the this keyword. 
	 * If you don't use the this keyword, compiler automatically adds this keyword while invoking the method. 
	 */

public class ThisCurrentClassMethod { 
	
	void m(){
		System.out.println("Hello m");
	}
	
	void n(){
		System.out.println("Hello n");
		this.m();
	}

	public static void main(String[] args) {
		
		ThisCurrentClassMethod k = new ThisCurrentClassMethod();
		k.n();

	}

}
