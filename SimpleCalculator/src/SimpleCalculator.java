import java.util.Scanner;

/* Program name: SimpleCalculator
 * Description: Simple two operand calculator   
 * Author: Nicholas Matthews
 * Date: 14/10/2020  
 * Version: 01  
 * Vocabulary word: Defenestrate - to throw out of a window
 * Inspirational quote and author (non-political, non-religious): It is better to keep your mouth closed and let people think you are a fool than to open it and remove all doubt.
 * */

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		//Variable declarations
		/* problems[0] = addition problems
		 * problems[1] = subtraction problems
		 * problems[2] = multiplication problems
		 * problems[3] = division problems
		 */
		int[] problems = new int[4];
		boolean finished = false;
		char operator = ' ';
		int op1 = 0;
		int op2 = 0;
		int answer = 0;
		Scanner userInput = new Scanner(System.in);
		
		//Initializes all problem counts to 0
		for(int i=0; i<4; i++) {
			problems[i] = 0;
		}
		
		//Prints out the initial prompt to the user
		System.out.println("Select the problem type you would like to calculate by entering the first letter of the operation.");
		System.out.println("(A)dd");
		System.out.println("(S)ubtract");
		System.out.println("(M)ultiply");
		System.out.println("(D)ivide");
		System.out.println();
		System.out.println("(E)xit");
		System.out.println();
		
		//Keeps prompting user for input until they decide to exit
		while (!finished) {
			
			System.out.println("Operation?");
			
			//Gets and formats the operator from user input
			operator = getOperator(userInput);
			
			//Tells the user what operation they selected
			if (operator == 'A') {
				System.out.println("You selected addition.");
			}
			else if (operator == 'S') {
				System.out.println("You selected subtraction.");
			}
			else if (operator == 'D') {
				System.out.println("You selected division.");
			}
			else if (operator == 'M') {
				System.out.println("You selected multiplication.");
			}
			else if (operator == 'E') {
				System.out.println("Goodbye.");
				System.out.println();
				break;
			}
			
			//Gets the operands from the user
			System.out.println("Enter your first number: ");
			op1 = getOperand(userInput);
			System.out.println("Enter your second number: ");
			op2 = getOperand(userInput);
			
			//Selects the appropriate calculation for user input
			if (operator == 'A') {
				answer = op1+op2;
				problems[0] += 1;
			}
			else if (operator == 'S') {
				answer = op1-op2;
				problems[1] += 1;
			}
			else if (operator == 'D') {
				answer = op1/op2;
				problems[3] += 1;
			}
			else if (operator == 'M') {
				answer = op1*op2;
				problems[2] += 1;
			}
			
			//Prints out the answer followed by a blank space
			System.out.println("The answer is "+answer);
			System.out.println();
			
		}
		
		//Reports the number of problems of each type performed
		reportProblems(problems);
		
	}
	
	private static char getOperator(Scanner input) {
		char output;
		output = input.next().charAt(0);
		if (output == 'a' || output == 'A') {
			return 'A';
		}
		else if (output == 's' || output == 'S') {
			return 'S';
		}
		else if (output == 'm' || output == 'M') {
			return 'M';
		}
		else if (output == 'd' || output == 'D') {
			return 'D';
		}
		else if (output == 'e' || output == 'E') {
			return 'E';
		}
		else {
			System.out.println("Please enter valid input.");
			input.nextLine();
			output = getOperator(input);
			return output;
		}
	}
	
	private static void reportProblems(int[] in) {
		System.out.println("Calculator Report");
		System.out.println("     Addition problems: "+in[0]);
		System.out.println("     Subtraction problems: "+in[1]);
		System.out.println("     Multiplication problems: "+in[2]);
		System.out.println("     Division problems: "+in[3]);
		System.out.println("     Total problems: "+(in[0]+in[1]+in[2]+in[3]));
	}
	
	private static int getOperand(Scanner input) {
		int output;
		output = input.nextInt();
		input.nextLine();
		return output;
	}
	
	
}
