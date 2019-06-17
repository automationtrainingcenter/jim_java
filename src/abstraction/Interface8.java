package abstraction;

public interface Interface8 {
	
	void methodOne();
	
	// static method
	public static void methodTwo() {
		System.out.println("static method of interface");
	}
	
	public default void methodThree() {
		System.out.println("default method of inteface");
	}

}
