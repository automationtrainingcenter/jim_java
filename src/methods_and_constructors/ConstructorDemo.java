package methods_and_constructors;

import java.util.Scanner;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */
public class ConstructorDemo {
	
	int id;
	String name;
	String course;
	String address;
	long phNum;
	double fee;
	
	//default constructor: i.e it does not accept any arguments
	public ConstructorDemo() {
		id = 100;
		name = "surya";
		course = "selenium";
		address = "lingampally";
		phNum = 9988877666l;
		fee = 8000.0;
	}
	
	//parameterized constructor
	public ConstructorDemo(int id, String name, String course, String address, long phNum, double fee) {
		this(id, name, course, phNum, fee);
		this.address = address;
	}
	
	public ConstructorDemo(int id, String name, String course, long phNum, double fee) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.phNum = phNum;
		this.fee = fee;
	}
	
	public void printDetails() {
		System.out.println("id : "+id+"\nname : "+name+"\naddress : "+address+
				"\nphone num : "+phNum+"\nfee : "+fee);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
//		obj.setDetails(101, "", "", "", 9988877766l, 8000.00);
		obj.printDetails();
		
		
		ConstructorDemo obj1 = new ConstructorDemo(102, "ravi", "selenium", "miyapur", 6665551100l, 7500.00);	
		obj1.printDetails();
		
		ConstructorDemo obj2 = new ConstructorDemo(103, "chandana", "python", 8887771122l, 7500.00);
		obj2.printDetails();
		
//		ConstructorDemo obj3 = new constructorDe
	}

}
