import java.util.Scanner;


public class SubStringOccurances {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase();
		String sub = input.nextLine().toLowerCase();
		
		int count = 0;
	
		for (int i = 0; i <= text.length() - sub.length(); i++) {
		   if (text.substring(0 + i, sub.length() + i).contains(sub)) {
			   count++;
		   }
		}
		
		System.out.println(count);
	}

}
