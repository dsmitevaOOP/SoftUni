import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		String[] words = line.split("[\\W]+");
		System.out.println(words.length);
	}
}
