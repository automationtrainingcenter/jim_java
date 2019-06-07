package inheritance;

/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in OOP
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 * 
 * if a Parent class have a parameterized constructor only then child class must 
 * contain a parameterized constructor which will call the Parent class constructor
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		//single inheritance ChildOne - Parent
		Parent pObj = new Parent();
		pObj.methodOne();
		
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodOne(); //Parent class method 
		c1Obj.methodTwo(); //ChildOne class method
		
		
		//multi level inheritance SubChild - ChildOne - Parent
		SubChild scObj = new SubChild();
		scObj.methodOne(); // Parent class method
		scObj.methodTwo(); // ChildOne class method
		scObj.methodThree(); // SubChild class method
		
		
		//hierarchical inheritance ChildOne - Parent and ChildTwo - Parent
		c1Obj.methodOne(); // calling Parent class method using ChildOne class object
		c1Obj.methodTwo(); // calling ChildOne class method using ChildOne class object
//		c1Obj.methodFour();
		
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.methodOne(); //calling Parent class method using ChildTwo class object
		c2Obj.methodFour(); //calling ChildTwo class method using ChildTwo class object
// 		c2Obj.methodTwo();
		
		
		//create object of ChildOne class by giving object reference to the Parent class
		Parent pcObj = new ChildOne();
		pcObj.methodOne();
		/*
		 * to call childOne class method we have to typecast Parent class object
		 * reference to ChildClass
		 * ChildClass child_class_object = (ChildClass) parent_class_object
		 */
		ChildOne cObj = (ChildOne) pcObj;
		cObj.methodTwo();
		
		Parent p = new SubChild();
		p.methodOne();
		
		// typecast p to ChildOne class object
		ChildOne c1 = (ChildOne) p;
		c1.methodOne();
		c1.methodTwo();
		
		//type cast p to SubChild class object
		SubChild sc = (SubChild) p;
		sc.methodOne();
		sc.methodTwo();
		sc.methodThree();
	}
	
	

}
