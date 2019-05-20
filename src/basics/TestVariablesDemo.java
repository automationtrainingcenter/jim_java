package basics;

public class TestVariablesDemo {
	
	public static void main(String[] args) {
		//access instance variable of VariablesDemo class in this class
		//create an object of VariablesDemo class
		VariablesDemo obj = new VariablesDemo();
		obj.iVar = 100;
		System.out.println(obj.iVar);
		
		//access static variable of VariablesDemo class in this class
		//we can static variables using class name
		VariablesDemo.sVar = 200;
		System.out.println(VariablesDemo.sVar);
	}

}
