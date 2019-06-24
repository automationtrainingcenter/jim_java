package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is also collection in Java
 * Map is used to store the in key and value pairs
 * it is not index based
 * but to retrieve or to store the data we can use keys
 * Map is interface which is implemented by 
 * HashMap: it will not maintain any order
 * LinkedHashMap: it will maintain insertion order
 * TreeMap: it will maintain alphabetical order for character 
 * or ascending order for numerical data based on keys
 */

public class MapDemo {
	public static void main(String[] args) {
//		Map<String, Integer> courses = new HashMap<>();
//		Map<String, Integer> courses = new LinkedHashMap<>();
		Map<String, Integer> courses = new TreeMap<>();
		// verify map is empty or not
		System.out.println(courses.isEmpty());

		// add the data to the map
		courses.put("c", 30);
		courses.put("Java", 45);
		courses.put("Selenium", 75);
		courses.put("python", 45);
		courses.put("testing", 90);
		courses.put("SQL", 25);
		courses.put("Java", 40);

		// get the number of elements in map
		System.out.println(courses.size());

		// print the map on the console
		System.out.println(courses);

		// retrieve the data from a map
		System.out.println(courses.get("Java"));

		// iterating over keys of map
		Set<String> keys = courses.keySet();
		for (String key : keys) {
			System.out.println(key + " = " + courses.get(key));
		}

		// iterate over values of a map
		Collection<Integer> values = courses.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		// iterate over key and value pairs
		Set<Entry<String, Integer>> entrySet = courses.entrySet();
		for (Entry<String, Integer> set : entrySet) {
			System.out.println(set.getKey() + " : " + set.getValue());
		}

		// update the data in a map
		courses.put("SQL", 15);
		System.out.println(courses);

		// verify a key is available or not
		System.out.println(courses.containsKey("SQL"));

		// verify a value is available or not
		System.out.println(courses.containsValue(15));

		// remove the data
		courses.remove("cpp");
		System.out.println(courses);

		courses.remove("c", 30);
		System.out.println(courses);

		// remove all the values from a map
		courses.clear();
		System.out.println(courses);

	}
}
