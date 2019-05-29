package basics;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		String s3 = " webdriver";
		String s4 = "SUNSHINE";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println(s1.length()); // 8
		System.out.println(s3.length()); // 10

		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println(s1.isEmpty()); // false
		System.out.println(s2.isEmpty()); // true

		/* concat(): combines two given strings */
		String s7 = s1.concat(s3);
		System.out.println(s7);
		System.out.println(s1);
		System.out.println(s3);

		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals("selenium")); // true
		System.out.println("sunshine".equals(s4));// false
		System.out.println(s3.equals(s1)); // false

		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("selenium")); // true
		System.out.println("sunshine".equalsIgnoreCase(s4)); // true
		System.out.println(s3.equalsIgnoreCase(s1)); // false

		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s3.contains("web")); // true
		System.out.println(s4.contains("shine")); // false
		System.out.println(s5.contains(s1)); // true

		/* toLowerCase(): converts given string to lower case */
		System.out.println(s4.toLowerCase());

		/* toUpperCase(): converts given string to upper case */
		System.out.println(s1.toUpperCase());

		/* charAt(): returns a character at a given index number */
		char ch = s1.charAt(0); // s
		System.out.println(ch);
		System.out.println(s3.charAt(8)); // e

		/* indexOf(): returns index value of first occurrence of a given character */
		int i = s1.indexOf("e");
		System.out.println(i);
		System.out.println(s5.indexOf(s1));

		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s1.startsWith("sel")); // true
		System.out.println(s3.startsWith("web")); // false
		System.out.println(s4.startsWith("sun")); // false

		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s1.endsWith("nium")); // true
		System.out.println(s3.endsWith("driver")); // true
		System.out.println(s4.endsWith("shine")); // false

		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s5.replace('e', 'E'));
		System.out.println(s5.replace("Java", "Python"));

		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values Note: substring() will include the beginning
		 * index character and excludes ending index character
		 */
		System.out.println(s3.substring(1, 4)); // web
		System.out.println(s3.substring(4)); // driver

		/* toCharArray() return an array of characters inside the given string */
		char[] chars = s1.toCharArray();
//		System.out.println(chars.length); // 8
		String rString = "";
//		for (int j = s1.length() - 1; j >= 0; j--) {
//			rString += s1.charAt(j);
//		}
		for(int j = chars.length -1; j >= 0; j--) {
			rString += chars[j];
//			System.out.println(rString);
		}
		System.out.println(rString);
		
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
		
		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println("before trim s6 is ");
		System.out.println(s6);
		System.out.println("after trim");
		System.out.println(s6.trim());
	}

}
