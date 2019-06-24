package collections;
/*
 * List is an inbuilt data structure in Java
 * List is an interface and is implemented by ArrayList and LinkedList
 * To create a List use the following syntax
 * List<E> var_name = new ArrayList<T>();
 * List<E> var_name = new LinkedList<T>();
 * list is index based and index number always starts from 0.
 * list allows duplicate data
 */

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> courses = new LinkedList<String>();

		// find the number of elements in your list
		System.out.println(courses.size());

		// verify a is empty or not
		System.out.println(courses.isEmpty());

		// to add the data to the list
		courses.add("c");
		courses.add("Java");
		courses.add("Python");
		courses.add("django");
		courses.add("CPP");
		courses.add("selenium");
		courses.add("django");

		// print complete list on the console
		System.out.println(courses);

		// to retrieve the data from the list we can use get() by passing index number
		System.out.println(courses.get(1));

		// retrieve data using for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}

		// retrieve data from a list using for each loop
		for (String course : courses) {
			System.out.println(course);
		}
		
		// to insert the data
		courses.add(3, "Flask");
		System.out.println(courses);
		
		//to update the data
		courses.set(5, "c#");
		System.out.println(courses);
		
		// to delete the data
		courses.remove(2);
		System.out.println(courses);
		
		courses.remove("django");
		System.out.println(courses);
		
		//search for a certain element in the list
		System.out.println(courses.contains("Flask"));
		
		// remove all the data from list
		courses.clear();
		
	}

}
