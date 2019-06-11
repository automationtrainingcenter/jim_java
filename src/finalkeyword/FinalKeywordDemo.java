package finalkeyword;

/**
 * we can declare a variable or method or class as final
 * if we declare a variable as final then we can't change it's value
 * If we declare a method as final in parent class then in child class we can't
 * override that method
 * if we declare a class as final that class can't have child class but it can have
 * a parent class
 */

public class FinalKeywordDemo {
	public static void main(String[] args) {
//		FinalVariableDemo.fVar = "Java";
		System.out.println(FinalVariableDemo.fVar);
		FinalVariableDemo.methodOne();
	}
}
