import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number to be multplied on first line and table length on the next!?");
		
		int input = scan.nextInt();
		int tableSize = scan.nextInt();
		
		System.out.println("The following tables are:");
		
		for (int i = 1; i <= tableSize; i++) {
			System.out.println(input * i);
		}
	}
}