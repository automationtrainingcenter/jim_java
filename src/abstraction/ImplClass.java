package abstraction;

public class ImplClass implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("interface one method one definition");
	}

	@Override
	public void methodTwo() {
		System.out.println("interface two method two definition");
	}
	
}
