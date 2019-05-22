package basics;
/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean
* 		char which will store single character - Character
*		byte store integer values - Byte
*		short store integer values - Short
*		int store integer values -Integer
*		long store integer values - Long
*		float store floating point number -Float
*		double store floating point number - Double
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of primitive data to another type of primitive data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/
public class DataTypesDemo {
	
	public static void main(String[] args) {
		//boolean
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		//char
		char ch = 'a';
		System.out.println("character value is "+ch);
		System.out.println("min value of character data type is "+Character.MIN_VALUE);
		System.out.println("max value of character data type is "+Character.MAX_VALUE);
		
		//byte 
		byte by = 123;
		System.out.println("byte value is "+by);
		System.out.println("min value of byte data type is "+Byte.MIN_VALUE);
		System.out.println("max value of byte data type is "+Byte.MAX_VALUE);
		
		//short 
		short sh = 12345;
		System.out.println("short value is "+sh);
		System.out.println("min value of short data type is "+Short.MIN_VALUE);
		System.out.println("max value of short data type is "+Short.MAX_VALUE);
		
		//int 
		int i = 12345678;
		System.out.println("int value is "+i);
		System.out.println("min value of integer data type is "+Integer.MIN_VALUE);
		System.out.println("max value of integer data type is "+Integer.MAX_VALUE);
		
		//long
		long l = 123456789999l;
		System.out.println("long value is "+l);
		System.out.println("min value of Long data type is "+Long.MIN_VALUE);
		System.out.println("max value of Long data type is "+Long.MAX_VALUE);
		
		//float
		float f = 12.33f;
		System.out.println("float value is "+f);
		System.out.println("min value of float data type is "+Float.MIN_VALUE);
		System.out.println("max value of float data type is "+Float.MAX_VALUE);
		
		//double
		double d = 123.44;
		System.out.println("double value is "+d);
		System.out.println("min value of double data type is "+Double.MIN_VALUE);
		System.out.println("max value of double data type is "+Double.MAX_VALUE);
		
		//upcating -lower type to higher type
		short shLow = 12345;
		int iHigh;
		iHigh = shLow;
		
		
		//down casting - higher type to lower type
		short shHigh = 456;
		byte byLow;
		//lower_type_var_name = ( lower_type ) higher_type_var_name;
		byLow = (byte) shHigh;
		System.out.println(byLow);
		
		float fHigh = 123.33f;
		int iLow;
		iLow = (int) fHigh;
		System.out.println(iLow);
		
		//type conversion : primitive to wrapper
		//primitive to wrapper conversion
		int iPr = 512;
//		Integer iWr = new Integer(iPr);
		Integer iWr = Integer.valueOf(iPr);
		
		//wrapper to primitive 
		Double dWr = new Double(21.3);
//		double dPr = dWr;
//		System.out.println(dPr);
		double dPr = dWr.doubleValue();
		
		
		// primitive to reference
		int iP = 12345;
		String iS = Integer.toString(iP);
		System.out.println(iS+10);
		
		// reference to primitive
		String str = "3.14";
		double dP = Double.parseDouble(str);
		System.out.println(dP+10);
		
//		System.out.println(Integer.parseInt(str));
		
		String s1 = "1234";
		
		System.out.println(Double.parseDouble(s1));
		int i1 = Integer.parseInt(s1);
		System.out.println(i1+10);
		
		short sh1 = Short.parseShort(s1);
		System.out.println(sh1+10);
		
//		byte b1 = Byte.parseByte(s1);
//		System.out.println(b1+10);
	
	}

}
