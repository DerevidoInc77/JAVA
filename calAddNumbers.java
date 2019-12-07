import java.util.*;
//Import the java.util package for input/output.

public class calAddNumbers
//Declaring a public class called calAddNumbers. N.B File name must match class name.

{

public static void main (String [] args)
// Declaration of a method, public; anyone can access it, static;it belongs to the whole class, not just the one command. Void returns nothing and main is the name of this method. 


{



System.out.println("Input the first number to add");
//Print qoute to screen.

Scanner scanner = new Scanner (System.in);
//Create input scanner.

int cal1 = scanner.nextInt();
//A variable called cal1 that only accepts whole numbers (int) as values.

System.out.println("Input the second number to be added");


int cal2 = scanner.nextInt();
//Variables called cal 2

int cal3 = cal1 + cal2;
//and cal 3; both of type (int).

System.out.println("The answer is: " + cal3 + " ");
//Print qoute sentence with input from cal1 and cal 2

}
}
//end all java scripts with a curly bracket.
