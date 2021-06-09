import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		myTimer(enterNumber());
	}

	public static void myTimer(int count) {
		try {
		long prev = System.currentTimeMillis();
		int timer = count;
		long current;
		
		System.out.println(timer);
		while (timer > 0) {
			current = System.currentTimeMillis();
			if (current == prev + 1000) {
				timer -= 1;
				if (timer > 0) {
					System.out.println(timer);
					prev = current;
				} else {
					System.out.println("Game Over!");
					return;
				}
			}
		}
	}
	catch(InputMismatchException e) {
		e.printstacktrace();
	}
}

	public static int enterNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number to start counting from:");
		int numb = sc.nextInt();
		sc.close();
		return numb;
	}
}