package abstraction;

public class OuterInnerImple implements Outer, Outer.Inner{

	@Override
	public void methodOne() {
		System.out.println("outer interface implementation");
	}

	@Override
	public void methodTwo() {
		System.out.println("inner interface implementation");
	}

	@Override
	public Inner method() {
		return this;
	}
	
}
