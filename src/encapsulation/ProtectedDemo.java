package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	
	public static void main(String[] args) {
		ProtectedDemo obj = new ProtectedDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar); // can't be accessed outside the package
		System.out.println(obj.proVar);
	}

}
