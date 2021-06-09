import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		for(int i = 0; i < sentence.length(); i++) {
			System.out.println(sentence.charAt(i));
		}
}
}