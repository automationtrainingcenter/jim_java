package polymorphism;

public class RunTimePolyChild extends RunTimePolyParent {

	@Override
	public void methodTwo(int a, String b) {
		System.out.println("child");
		if(b.matches("\\d.")) {
			//converting b to integer and adding
			System.out.println(a+Integer.parseInt(b));
		}else {
			//concatination of integer and string
			System.out.println(a+b);
		}
	}
	
	public void methodThree() {
		System.out.println("child class method only");
	}

}
