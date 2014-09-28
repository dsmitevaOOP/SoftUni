import java.util.ArrayList;
import java.util.Scanner;


public class CombineLists {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		String secLine = input.nextLine();
		
		ArrayList<Character> text = new ArrayList<>();
		ArrayList<Character> app = new ArrayList<>();
		ArrayList<Character> res = new ArrayList<>();
		
		for (int i = 0; i < line.length(); i++) {
			
			text.add(line.charAt(i));
			res.add(line.charAt(i));
		}
		
		for (int i = 0; i < secLine.length(); i++) {
					
			if (text.contains(secLine.charAt(i))) {
				continue;
			}
			
			res.add(' ');
			res.add(secLine.charAt(i));
		}
		
		for (int i = 0; i < res.size(); i++) {
			
			System.out.print(res.get(i));
		}
	}
}
