
import java.util.*;
//Imports java.util package for input/output.

public class CalCheckPassFail
//Declaration of a public class and the class name; all java files need this.


{

// Save as "CalCheckPassFail.java"



public static void main(String [] args) {
//Declares a public method that returns nothing; void, so it is a command, called main.

Scanner scanner = new Scanner (System.in);
//Declaring that we want to use the imported input/output scanner.

System.out.println("Mark?");
//Commands the computer system to print whatever is in the qoutes to the screen.

int mark = scanner.nextInt ();
//Creates a variable; in this case input, because of the scanner, which only accepts int (whole numbers), and it is called mark.

// All of the above are to set up the program.




// Start of program.
  
if ( mark < 49 ) {
//If something is true. open curly then write instruction to computer.
			System.out.println("Fail");
} 			//do this.
//close curly bracket
else
// If condition not true.
{
	System.out.println("Pass" );
	//do this.
}




				  //mark is the variable name from earlier; writing like this, "+ mark +", prints what the user input.
System.out.println("The mark is " + mark + " ");
//Print to screen. //this, in the brackets/qoutes.

System.out.println("Done");

}

}