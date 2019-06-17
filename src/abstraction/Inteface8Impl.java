package abstraction;

public class Inteface8Impl implements Interface8{

	@Override
	public void methodOne() {
		System.out.println("method one implementation");
	}
	
	
//	we can't override static methods of interface
//	@Override
//	public static void methodTwo() {
//		System.out.println("static method of interface");
//	}
	
	// we can override default methods of interface
	@Override
	public void methodThree() {
		System.out.println("default method override");
	}
	
	
	
}
