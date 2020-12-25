import java.util.Scanner;

public class Homework2 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner (System.in);
		//Reads and assigns first name
		System.out.print("Please enter your first name: ");
		String first = input.nextLine();
		//Reads and assigns middle name
		System.out.print("Please enter your middle name: ");
		String middle = input.nextLine();
		//Reads and assigns last name
		System.out.print("Please enter your last name: ");
		String last = input.nextLine();
		//Prints out the given name
		System.out.println("Your name is "+first+" "+middle+" "+last+".");
		//Extracts the first character from every part of the name and makes it an initial
		System.out.println("Your initials are: "+first.charAt(0)+". "+middle.charAt(0)+". "+last.charAt(0)+". ");

	}

}
