import java.util.*;
// imports java.util package with input scanner

public class calHigherLower 
//Declares a class called calHigherLower; file name must be the same as class name

{

//Curly brackets open and close everything; statements, methods and entire class

	public static void home() 
{	//A method called home; Can be called upon later

	System.out.println("Welcome!");
}	//Print message; "Welcome!"


	public static int getRandomNumber() 
	//A numbers (int) method called getRandomNumber
{	

	Random rand = new Random();
	//A Random valued variable called rand

	return rand.nextInt(100);
	//Returns the value of varable rand in int (numbers) out of 100
}

	public static void main(String[] args)
	// Declaring start of application
{

	Scanner scanner = new Scanner(System.in);
	//Creating the scanner for system input (System.in)
	
	home();
	//Calling on the home method; Does whatever is in the home method
	
	System.out.println("How much money you carrying?" );
	//Print message to screen; inside brackets and qoutes

	double money = scanner.nextInt();
	// Creating a double, (longer values allowed), variable called money with the value equal to user input (nextInt) only numbers, (int), allowed
	
	System.out.println("You are carrying £" +money );
	//Prints a message to screen; everything in the bracketed qoute marks

	System.out.println("This is a game of higher or lower... you must guess if the next number will be higher... OR LOWER than the last one");
	//Prints a message; everything in the bracketed qoute marks, to screen
	
	boolean gameOver = false;
	//Creates a true or false variable (boolean); checks for a condition, specified later

	int firstNumber = getRandomNumber();
	//Creates int variable called firstNumber; the equals signs assigns a specified value, in this case, the getRandomNumber method

	System.out.println("The first number is: " + firstNumber);
	//Prints message in the bracketed qoutes; the plus sign followed by a name means that it will print the value of that variable, if it exists

	
	while(!gameOver)
	//Creates a while statement; checks a condition is still happening; similar to boolean if statements, exclamation mark before variable name means not true or is false
{

	System.out.println("Is the next number HIGHER, or LOWER?");
	//Prints a message to screen; inside qoutes and brackets

	String answer = scanner.next();
	//Creates variable with a String value called answer; (Scanner.next()), means that the value must be input by user
	
	answer = answer.toLowerCase();
	//converts value of answer variable to lower case

	int secondNumber = getRandomNumber();
	//Creates a number (int) value variable and sets it to the equivalent of random method
	
	if(answer.equals("lower"))

{

	System.out.println("The number was" + secondNumber + "");
	//Print a message to screen; inside brackets and qoutes	

	if(secondNumber < firstNumber)
	//Creates an if condition (statement); specified within brackets
{

	System.out.println("YOU WIN!!");
	//Print message to screen; inside brackets and qoutes

	firstNumber = secondNumber;
	//firstNumbe's value is being changed to secondNumber's value
}

else

{

	System.out.println("YOU LOSE!!");
	//Prints a message to screen; inside brackets and qoute

	gameOver = true;
	//Changes boolean variable, gameOver, value to be true
}

}

	else if(answer.equals("higher")) 
	//Adds an else statement to the other else statement
{

	System.out.println("The number was " + secondNumber);
	//Prints a message to screen; inside brackets and qoutes
	
	if(secondNumber > firstNumber) 
	//An if statement; checking if secondNumber variable value is greater than firstNumber value then do this
{
	System.out.println("YOU WIN!!");
	//Prints a message to screen; inside brackets and qoutes
	
	firstNumber = secondNumber;
	//Changing value of firstNumber variable to equal secondNumber value
}
	else 
	//An else statement for the if statement; if condition is not true
{

	System.out.println("YOU LOSE!!");
	//Prints a message to screen; inside brackets and qoutes
	
	gameOver = true;
}	//Changes value of gameOver boolean variable to equal true

}
	else 
	//An else statement; if condition is false, do this
{
	System.out.println("Please enter a valid number. Try again");
	//Print a message to screen; inside brackets and qoutes
}

}

}

}