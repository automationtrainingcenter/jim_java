package basics;

public class InstancVsStatic {
	
	int i = 0;
	static int j = 0;
	
	public void increment() {
		i++; // i = i+1
		j++; // j = j+1
		System.out.println("i = "+i+" j = "+j);
	}
	
	public static void main(String[] args) {
		InstancVsStatic obj1 = new InstancVsStatic();
		obj1.increment(); // i = 1  j = 1  
		
		InstancVsStatic obj2 = new InstancVsStatic();
		obj2.increment(); // i = 1 j =  1
		
		InstancVsStatic obj3 = new InstancVsStatic();
		obj3.increment(); // i = 1 j =  1
	}

}
