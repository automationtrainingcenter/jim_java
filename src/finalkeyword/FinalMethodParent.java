package finalkeyword;

public class FinalMethodParent {
	public void methodOne() {
		System.out.println("normal method of parent class");
	}
	
	public final void methodTwo() {
		System.out.println("final method of parent class");
	}
}
