package collections;
/*
 * Set is also collection in Java
 * Set is an interface which is implemented by
 * HashSet: it will not maintain any order for your data
 * LinkedHashSet: it will maintain insertion order
 * TreeSet: it will maintain alphabetical order for character data and ascending order 
 * for numeric data
 * Set is not index based
 * Set does not allow duplicate values
 * To iterate over a set we have to use for each loop or Iterator interface
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// create set
//		Set<String> courses = new HashSet<>();
		Set<String> courses = new TreeSet<>();
		// verify set is empty or not
		System.out.println(courses.isEmpty());

		// find the number of elements in your set
		System.out.println(courses.size());

		// add the data to the set
		courses.add("c");
		courses.add("Java");
		courses.add("Python");
		courses.add("django");
		courses.add("CPP");
		courses.add("selenium");
		courses.add("django");

		// print the values of set
		System.out.println(courses);

		System.out.println(courses.size());

		// retrieve the data using for each loop
		for (String course : courses) {
			System.out.println(course);
		}
		
		//Iterator interface to retrieve the data
		Iterator<String> itr = courses.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// delete the data from the set
		courses.remove("django");
		
		System.out.println(courses);
		
		//search for an element
		System.out.println(courses.contains("selenium"));
		
		//remove all the data
		courses.clear();
		System.out.println(courses);
		
	}
}
