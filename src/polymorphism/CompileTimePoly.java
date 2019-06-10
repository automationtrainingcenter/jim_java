package polymorphism;

public class CompileTimePoly {
	
	public void methodOne(int a, String b) {
//		System.out.println(a+Integer.parseInt(b));
		methodOne(a, Integer.parseInt(b));
	}
	
	//type of input
	public void methodOne(int a, int b) {
		System.out.println(a+b);
	}
	
	//number of inputs
	public void methodOne(int a, String b, int c) {
//		System.out.println(a+Integer.parseInt(b)+c);
		methodOne(a+c, Integer.parseInt(b));
	}
	
	//sequence of inputs
	public void methodOne(String a, int b) {
//		System.out.println(Integer.parseInt(a)+b);
		methodOne(Integer.parseInt(a), b);
	}
	
//	//return of the method
//	public int methodOne(int a, String b) {
//		//not possible: we can't method overloading by simply changing return type of the method
//	}

}
