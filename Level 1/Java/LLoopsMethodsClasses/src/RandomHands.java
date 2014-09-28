import java.util.Random;
import java.util.Scanner;


public class RandomHands {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(); 
		int n = input.nextInt();
		 
		char[] suit = new char[4];
		suit[0] = '\u2663';
		suit[1] = '\u2665';
		suit[2] = '\u2666';
		suit[3] = '\u2660';
		
		String[] cards = new String[52];
		int count = 0;
		
		for (int i = 0; i < suit.length; i++) {
		
			for (int j = 2; j < 15; j++) {
				
				switch (j) {
				
				case 11:
					cards[count] = "J" + suit[i] + " ";
					break;
				
				case 12:
					cards[count] = "Q" + suit[i] + " ";
					break;
				
				case 13:
					cards[count] = "K" + suit[i] + " ";
					break;
				
				case 14:
					cards[count] = "A" + suit[i] + " ";
					break;

				default:
					cards[count] = "" + j + suit[i] + " ";
				
				}
				
				count++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				
				int random = rand.nextInt(52); 
				System.out.print(cards[random] + " ");	
			}
			
			System.out.println();
		}
	}

}
