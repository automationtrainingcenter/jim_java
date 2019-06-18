package abstraction;

import java.util.Scanner;

import abstraction.Outer.Inner;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * A class can implement multiple interfaces and can only extends one normal class or one abstract class
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * 
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * Type of interfaces
 * Marker or tagged interface
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */

public class AbstractionDemo {

	public static void main(String[] args) {
		// give object reference to the abstract class and object creation to the
		// child classes which provides definition to the abstract class abstract
		// methods
		AbstractClassDemo obj = new AbstractClassImpl();
		obj.methodOne();
		obj.methodTwo();

		// give object reference to the interface and object creation to
		// any implementation class
		InterfaceDemo iObj = new InterfaceImpl();
		iObj.methodOne();
		iObj.methodTwo();

		InterfaceOne i1Obj = new ImplClass();
		i1Obj.methodOne();

//		InterfaceTwo i2Obj = new ImplClass();
//		InterfaceTwo i2Obj  = (ImplClass) i1Obj;
		InterfaceTwo i2Obj = (InterfaceTwo) i1Obj;
		i2Obj.methodTwo();

		// inner interfaces
		Outer oiObj = new OuterInnerImple();
		oiObj.methodOne();
		((Inner) oiObj).methodTwo();

		Inner inObj = oiObj.method();
		inObj.methodTwo();

		// object chaining
		oiObj.method().methodTwo();
		
		//Functional interface using normal java class
		FuncInterfaceOne f1Obj = new FuncInteferfaceOneImple();
		f1Obj.methodOne();
		
		
		//Functional Interface using anonymous class
		FuncInterfaceOne fanon = new FuncInterfaceOne() {
			@Override
			public void methodOne() {
				System.out.println("method one definition using anonymous class");
			}
		};
		
		fanon.methodOne();
		
		// functional interface using lambda expression
		FuncInterfaceOne f1lam = () -> System.out.println("method one definition using lambda expression");
		f1lam.methodOne();
		
		
		FuncInterfaceTwo f2lam = (int a, String b) -> System.out.println(a+b);
		f2lam.methodTwo(10, "20");
		
		FuncInterfaceTwo f2lam1 = (int a, String b) -> {
			int ib = Integer.parseInt(b);
			System.out.println(a+ib);
		};
		
		f2lam1.methodTwo(10,  "20");
		
		FuncInterfaceThree f3lam = (String str) -> {
			if(str.matches("\\d*")) {
				System.out.println("integer data");
				return Integer.parseInt(str);
			}else {
				return str.length();
			}
		};
		
		
		System.out.println(f3lam.methodThree("123453"));
		System.out.println(f3lam.methodThree("sunshine"));
		System.out.println(f3lam.methodThree("12.222"));
		
		
		
	}

}
