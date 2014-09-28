import java.util.Scanner;


public class CountSpecifiedWord {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine().toLowerCase();
		String word = input.nextLine().toLowerCase();
		String[] words = line.split("[\\W]+");
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			if (words[i].equals(word)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
