package basics;
/*
 * If we want to execute a block of code for certain number of times then 
 * we are going to use loops
 * Every loop will have three parts
 * 1. initialization
 * 2. condition
 * 3. increment or decrement

 * In Java we have mainly 4 types of loops
 * Infinite loop: A loop which will run forever
 * 
 * 1. while loop
 * 		initialization;
 * 		while(expression){
 * 			statements;
 * 			increment/decrement;
 * 		}
 *  While will verify the condition first then only it'll execute the statements. 
 * 	i.e If the while condition is true then the statements inside the while block will be executed
 * 	The minimum iteration count is 0
 * 	
 * 2. do while loop
 * 		initialization;
 * 		do{
 * 			statements;
 * 			increment/decrement;
 * 		}while(expression);
 *  do-while loop will execute the statement inside the do block for first time then it will verify 
 *  the condition of while . If it is true then the statements inside do block will repeat execution 
 *  else do-while block will be terminated.
 *  The minimum iteration count is 1
 * 
 * 3. for loop
 * 		for(initialization; expression; increment/decrement){
 * 			statements;
 * 		}
 * The minimum iteration count is 0
 * 
 * 4. for-each loop
 * 		It is used iterate over an array or collection
 * 		for(array_type var_name : array_var_name){
 * 			statements;
 * 		}
 * 
 * 
 * we can terminate the loop based on some expression using "break" statement
 * we can skip the current iteration of the loop based on some condition using "continue" statement
 */

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
//		print numbers from 0 to 10
		int i = 0; // initialization
		while (i < 10) { // expression
			System.out.println(i);
			i++;
		}

		// print even numbers from 0 to 20 using do-while loop
		int j = 0; // initialization
		do {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++; // increment
		} while (j < 21); // condition

		// print multiples of 3 from 1 to 10 using for loop
		for (int k = 0; k < 10; k++) {
			if (k % 3 == 0) {
				System.out.println(k);
			}
		}

		// to iterate over a collection of data we can use for each loop
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for(char vowel : vowels) {
			System.out.println(vowel);
		}
		
		// verify a given number is prime or not
		//read number from the console
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		boolean status = true;
		for(int l = 2; l <= num / 2; l++) {
			if(num % l == 0) {
				status = false;
				break; // it terminate the loop 
			}
		}
		
		if(status) {
			System.out.println("given number is prime");
		}else {
			System.out.println("given number is not prime");
		}
	}

}
