package session3_assignment2; //package declaration

	/*
	 * If local variables(formal arguments) and instance variables are different, 
	 * there is no need to use this keyword
	 * If both the local variables and arguements are same, then we need to make the use of 'this' keyword.
	 */

public class ThisCurrentClassInstanceVariable {
	
	int rollno;
	String name;
	double fee;

	ThisCurrentClassInstanceVariable(int rollno, String name, double fee) {
		
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		
	}

	void display(){
		
		System.out.println(rollno + " " + name + " " + fee);
		
	}
	
	public static void main(String[] args) {
		
		ThisCurrentClassInstanceVariable k = new ThisCurrentClassInstanceVariable(1, "Sri", 10.00);
		ThisCurrentClassInstanceVariable k1 = new ThisCurrentClassInstanceVariable(1, "Nivas", 10.00);

		k.display();
		k1.display();

	}
}