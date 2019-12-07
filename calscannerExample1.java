import java.util.*;
//Imports the package with the input scanner API.



public class calScannerExample1 {
//Declare the class name at beginning of file; Must be the same as file name.

	public static void main(String[] args) {
		//*Public means anyone can access the code, static creates space in memory; RAM, void is a return type; nothing, and main() is the name of the method.

		System.out.println ("A scanner code!");
		//System.out.print means that the computer will write whatever you put in the brackets, qoutes, on screen.
		
		Scanner scanner = new Scanner (System.in);
		//This is a command that uses the input API in java.util package; without this, this java file would not work.

		System.out.println ("Enter your name please: ");
		//Writes whatever is in the qoutes, on screen; applies to all System.out.print commands.

		String firstName = scanner.next ();
		//Declares a "String" variable; a variable saves whatever the user inputs to it, this is important for the java file, as it can then be used to return what the user said to it at the end.
		
		System.out.println ("Enter your age: ");

		int age = scanner.nextInt ();
		//Declares an "int" variable, called age in this case (the name can be whatever you want.). Int variables only allow whole numbers as input.
		
		System.out.println("Are you sporty?: ");
		
		String sportActiveString = scanner.next ();
		//A string variable called sportActiveString; which waits for input "scanner.next()".

	


		System.out.println ("You are " + firstName + " and you are " + age + " years old. You answered " + sportActiveString + " for sporty. ");
}		//Writes whats in qoutes; the extra qoutes and + signs mean that the computer will return whatever was input in the specified variable (between the + signs).
}