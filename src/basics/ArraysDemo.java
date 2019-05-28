package basics;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multipl e values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {

	public static void main(String[] args) {
		// declaring an array
		// data_type[] var_name = new data_type[length];
		// length means number of values we are going to store
		int[] numbers = new int[6];
		// storing data in array using index numbers
		// arr_var_name[index] = value;
		numbers[0] = 21;
		numbers[1] = 25;
		numbers[2] = 19;
		numbers[3] = 23;
		numbers[4] = 22;
//		numbers[5] = 20;
//		numbers[6] = 18; //ArrayIndexOutOfBoundException

		// retrieve the data from the array using index number
		// arr_var_name[index]
		System.out.println(numbers[5]);

		// retrieve all the array data using for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("the value at index " + i + " is " + numbers[i]);
		}

		// retrieve all the array data using for each loop
		// for(array_data_type var : arr_var_name)
		for (int number : numbers) {
			System.out.println(number);
		}

		// 2D array
		// data_type[][] var_name = new data_type[row_length][col_length]
		int[][] matrix1 = new int[2][2];

		// store the data
		matrix1[0][0] = 1;
		matrix1[0][1] = 0;
		matrix1[1][0] = 0;
		matrix1[1][1] = 1;

		// retrieve the data
		System.out.println(matrix1[0][0]);

		// using normal for loop
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
