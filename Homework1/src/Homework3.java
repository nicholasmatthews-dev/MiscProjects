import java.util.Scanner;

public class Homework3 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Please enter a food item: ");
		//Gets the name of the food
		String food = input.nextLine();
		//Gets a number of calories for the food
		int calories = getCalories();
		//Prints out the food name
		System.out.println("Food: "+food);
		//Prints out the amount of calories in the food
		System.out.println("Calories: "+calories);
		//Lists how many minutes you have to walk, rounded up because you'll need at least that much time in minutes.
		System.out.println("Minutes to walk: "+((int)(calories/5.4+1)));
		

	}
	//Method for recursively prompting for a valid number of calories until a valid value is entered
	private static int getCalories() {
		int output = 0;
		System.out.print("Please enter the amount of calories for this item: ");
		try {
			output = input.nextInt();
		}
		catch (Exception e) {
			System.out.println("Please enter a valid integer.");
			input.nextLine();
			output = getCalories();
		}
		return output;
	}

}
