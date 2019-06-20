package collections;
/*
 * List is an inbuilt data structure in Java
 * List is an interface and is implemented by ArrayList and LinkedList
 * To create a List use the following syntax
 * List<E> var_name = new ArrayList<T>();
 * List<E> var_name = new LinkedList<T>();
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		List<String> courses = new ArrayList<String>();
		
		
		//find the number of elements in your list
		System.out.println(courses.size());
		
		//verify a is empty or not
		System.out.println(courses.isEmpty());
		
		//to add the data to the list
		courses.add("c");
		courses.add("Java");
		courses.add("Python");
		courses.add("django");
		courses.add("CPP");
		courses.add("selenium");
		
		//print complete list on the console
		System.out.println(courses);
	}

}
