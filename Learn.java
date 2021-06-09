import java.util.Scanner;

public class Learn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word or sentence containing numbers:");
		String text = sc.nextLine();
		int amount = 0;

		for (int i = 0; i < text.length(); i++) {
			if (i == text.length() - 1 && amount == 0){
				System.out.println("There are no numbers contained in this string!");
				return;
			} else if (Character.isDigit(text.charAt(i))) {
				amount += 1;
				System.out.println(text.charAt(i));	
			}
		}
	}
}