import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


public class MostFrequentWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int temp = 0;
		
		int max = 0;
		String res = "";
		ArrayList<String> my = new ArrayList<>();
		
		String[] words = input.nextLine().toLowerCase().split("[\\W]+");
			
		Map<String, Integer> wordsCount = 
				new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count+1);
		}
		
		for (String word : wordsCount.keySet()) {
			
			int count = wordsCount.get(word);
			
			if (count > max) {
				max = count;
				res = word;
			}
		}
		
		for (String word : wordsCount.keySet()) {
			
			int count = wordsCount.get(word);
			
			if (count == max) {
				
				my.add(word);
			}
		}
		
		my.sort(null);
		
		if (my.size() != 0) {
			
			for (int i = 0; i < my.size(); i++) {
				
				System.out.printf("%s -> %d times\n", my.get(i), max);
			}
		
		} else {
		
			System.out.printf("%s -> %d times\n", res, max);
		}
	}

}
