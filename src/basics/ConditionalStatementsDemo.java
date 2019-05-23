package basics;

/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */


public class ConditionalStatementsDemo {
	
	public static void main(String[] args) {
		int num = 99;
		System.out.println("if started");
		if(num >= 0) {
			System.out.println("given number is positive");
		}
		System.out.println("if ended");
		
//		 verify given number is even or odd
		if(num % 2 == 0) {
			System.out.println("given number is even");
		}else {
			System.out.println("given number is odd");
		}
		
		
//		else if ladder
		String browser = "edgee";
		if(browser.equals("firefox")) {
			System.out.println("firefox browser launched");
		}else if(browser.equals("chrome")) {
			System.out.println("chrome browser launched");
		}else if(browser.equals("opera")) {
			System.out.println("opera browser launched");
		}else if(browser.equals("edge")) {
			System.out.println("edge browser launched");
		}else {
			System.out.println("IE browser launched");
		}
		
		// nested if
		String username = "sunshine";
		if(username.equals("sunshine")) {
			String password = "selenium";
			if(password.equals("selenium")) {
				System.out.println("welcome user");
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("invalid username");
		}
		
		// switch case
		char grade = 'b';
		
		switch(grade) {
		case 'a':
			System.out.println("you scored a grade");
			break;
		case 'b':
			System.out.println("you scored b grade");
			break;
		case 'c':
			System.out.println("you scored c grade");
			break;
		case 'd':
			System.out.println("you scored d grade");
			break;
		default:
			System.out.println("invalid grade");
		}
	}

}
