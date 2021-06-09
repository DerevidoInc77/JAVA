import java.util.Scanner;

 public class cubeNumber {
	public static void main(String[] args) {
		int num;
		int cubed;
		int power;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number on first line and power on second:");
		 num = scan.nextInt();
		 power = scan.nextInt();
		 cubed = num;
		for(int i = 1; i < power; i++) {
			num *= cubed;
	}
	System.out.println("The answer is " + num + ".");
  }
}