import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class ExtractUniqueWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] words = input.nextLine().toLowerCase().split("[\\W]+");
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		
		set.stream().sorted().forEach(x -> System.out.print(x + " "));
	}

}
