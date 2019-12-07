import java.util.*;

public class inputOutput

//Declare class with name inputOutput

{
	public static void main(String[] args) 
	//A public method called main.
{
	
	System.out.println("Welcome to a different type of coding world!!");

	Scanner scanner = new Scanner(System.in);
	//Creating input scanner.
	
	System.out.println("Enter your first name please:");

	String firstName = scanner.next();
	//A string variable that waits for input.

	System.out.println("Enter your age please:");

	int age = scanner.nextInt();
	//A variable called age with an int value (only accepts whole numbers.)
	
	System.out.println("Your name is: " + firstName + " and your age is: " + age + " ");
	//Print qoute while including input.	
}
}