package basics;

import java.util.Scanner;

/*to read data from the console we have to use Scanner class
 * this class provides several methods to read different types of data
 */
public class ReadingData {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//reading integer data
		System.out.println("enter a number");
		int a = s.nextInt();
		System.out.println("you entered "+a);
		
		
		//reading floating point number
		System.out.println("enter a float number");
		float f = s.nextFloat();
		System.out.println("float number is "+f);
		
		
		//double 
		System.out.println("enter a double number");
		double d = s.nextDouble();
		System.out.println("double number is "+d);
		
		
		//boolean
		System.out.println("enter a boolean value");
		boolean b = s.nextBoolean();
		System.out.println("boolean value is "+b);
		
		//string
		System.out.println("enter a string value");
		String str = s.next();
		System.out.println("string value is "+str);
		
		//character
		System.out.println("enter a character");
		char ch = s.next().toLowerCase().charAt(0);
		System.out.println("charactar value is "+ch);
	}

}
