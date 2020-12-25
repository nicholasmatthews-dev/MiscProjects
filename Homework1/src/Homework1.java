import java.util.Scanner;

public class Homework1 {
	private static Scanner input;
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		input = new Scanner(System.in);
		num1 = getNumber();
		num2 = getNumber();
		System.out.println("Your numbers are: "+num1+" and "+num2+".");
		System.out.println("Sum = "+(num1+num2));
		System.out.println("Product = "+(num1*num2));
	}
	
	private static int getNumber() {
		int output = 0;
		System.out.print("Please enter a number: ");
		try {
			output = input.nextInt();
		}
		//Catches anything that isn't a number and recursively calls the function until a valid number is entered.
		catch (Exception e) {
			System.out.println("Please enter a valid number");
			input.nextLine();
			output = getNumber();
		}
		return output;
	}

}
