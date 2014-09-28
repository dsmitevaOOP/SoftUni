import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;


public class CardsFrequencies {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] words = input.nextLine().split("[♥♣♦♠ ]+");
		
		double n = words.length;
			
		Map<String, Integer> wordsCount = 
				new LinkedHashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count+1);
		}
		
		for (Map.Entry<String, Integer> word : wordsCount.entrySet()){
			double perc = word.getValue() / n * 100;
			System.out.printf("%s -> %.2f times\n", word.getKey(), perc);
    }		
	}
}
