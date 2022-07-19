import java.util.Random;
import java.util.Scanner;

public class russianRoulette {
	public static void main(String[] args) {
		Menu(); 
		}
	public static void Shoot() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the name of player 1: ");
		String playerone = sc.nextLine();
		System.out.print("Please enter the name of player 2: ");
		String playertwo = sc.nextLine();
		System.out.print("Please enter the name of player 3: ");
		String playerthree = sc.nextLine();
		System.out.print("Please enter the name of player 4: ");
		String playerfour  = sc.nextLine();
		System.out.print("Please enter the name of player 5: ");
		String playerfive = sc.nextLine();
		System.out.print("Please enter the name of player 6: ");
		String playersix = sc.nextLine();
		String loser = "";
		Random rand = new Random();
		long start = System.currentTimeMillis();
		int bullets = 6;
		int bang = 1;
		int status = 1;
		int turn = 1;
		while(bullets > 0 && status >= 1) {
			if(System.currentTimeMillis() == start + 3000) {
			start = System.currentTimeMillis();
			bang = rand.nextInt(6);
			bullets --;
		if (bullets == bang){
			System.out.println("*Bang*! You lose!");
		if(turn == 1) {
			loser = ""+playerone;
		} 
		else if(turn == 2) {
			loser = ""+playertwo;
		}
		else if(turn == 3) {
			loser = ""+playerthree;
		}
		else if(turn == 4) {
			loser = ""+playerfour;
		}
		else if(turn == 5) {
			loser = ""+playerfive;
		}
		else if(turn == 6) {
			loser= ""+playersix;
		}
			status = 0;
		}
		if(turn == 1) {
			turn = 2;
		} 
		else if(turn == 2) {
			turn = 3;
		}
		else if(turn == 3) {
			turn = 4;
		}
		else if(turn == 4) {
			turn = 5;
		}
		else if(turn == 5) {
			turn = 6;
		}
		else if(turn == 6) {
			turn = 1;
		}
			if(status == 0) {
				System.out.println("Game over! *slams sliding door*\n"+loser+" is dead!");
				Menu();
			}
		else {
			System.out.println("*CLICK*, Hahahahaha!!!");
		}
			if(bullets <= 0 && status >= 1 && loser.equals("")) {
				System.out.println("Congratulations! everyone is still alive! Well done!");
				Menu();
			}
			}
		}
	}
	
	public static void Menu() {
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
			Menu();
	}
}
}