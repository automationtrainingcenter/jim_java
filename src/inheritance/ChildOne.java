package inheritance;

public class ChildOne extends Parent{
	
	public ChildOne() {
		super();
		System.out.println("Child one object created");
	}
	
	public void methodTwo() {
//		methodOne();
		System.out.println("method two of ChildOne class");
	}

}
