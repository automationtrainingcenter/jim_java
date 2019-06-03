package encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {
	/*
	 * encapsulation means hiding data or properties or binding data and the operations
	 * on data together is known as encapsulation
	 * hide data or properties by declaring them using private access modifier
	 * create setter and getter methods of private variables
	 */

	private int id;
	private String name;
	private String designation;
	private double salary;

	public EncapsulationDemo(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	// getter for id : returns id property value
	public int getId() {
		return this.id;
	}

	// setter for id : set id property value to a given new value
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return this.name;
	}

	public String getDesignation() {
		return this.designation;
	}

	public double getSalary() {
		return this.salary;
	}

	public void display() {
		System.out.println("id = " + this.id + "\nname = " + this.name + "\ndesignation = " + this.designation
				+ "\nsalary = " + this.salary);
	}

	public void setPromotion(String newDesignation) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter admin username");
		String uname = sc.next();
		if (uname.equalsIgnoreCase("admin")) {
			System.out.println("enter admin password");
			String pwd = sc.next();
			if(pwd.equals("Admin")) {
				this.designation = newDesignation;
				System.out.println("designation changed successfully");
				System.out.println("sending a congratulations mail.. to "+this.name);
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("please check your username");
		}
	}

}
