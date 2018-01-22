import java.util.Scanner;
public class Energy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	double energy;	

	System.out.println("Enter the amount of water in kilograms?");
	double number1 = input.nextDouble();

	System.out.println("Enter the initial temperature?");
	double number2 = input.nextDouble();
	
	System.out.println("Enter the final temperature?");
	double number3 = input.nextDouble();
	
	energy = (number1) * (number3) - (number2);
	System.out.println("The energy needed is  " + energy);
	
	
	}

}
