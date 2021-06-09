import java.util.Random;
import java.util.Scanner;

public class russianRoulette {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Wanna play Russian Roulette? [Y/N]");
		char play = sc.next().charAt(0);
		if(play == 'Y' || play == 'y') {
			System.out.println("Loading gun...");
			Shoot();
			sc.close();
			return;
		}
		else if(play == 'N' || play == 'n') {
			System.out.println("Ah well. next time!");
			return;
		}
		else {
			System.out.println("Please only enter either Y or N");
			return;
		}
	}
	public static void Shoot() {
		long start = System.currentTimeMillis();
		Random rand = new Random();
		int bang = 1;
		while(bang > 0) {
			if(System.currentTimeMillis() == start + 3000) {
			start = System.currentTimeMillis();
			bang = rand.nextInt(10) + 1;
		if (bang == 8){
			System.out.println("*Bang*! You lose!");
			bang = 0;
			return;
		}
		else {
			System.out.println("*CLICK*, Hahahahaha!!!");
		}
	}
}
}
}