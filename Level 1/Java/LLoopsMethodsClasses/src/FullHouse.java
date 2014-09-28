import java.util.Scanner;


public class FullHouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] cards = new String[13];
		StringBuilder fullHouse = new StringBuilder();
		int count = 0;
		int counter = 0;
		
		char[] suit = new char[4];
		suit[0] = '\u2663';
		suit[1] = '\u2665';
		suit[2] = '\u2666';
		suit[3] = '\u2660';
		
		
		for (int i = 2; i < 15; i++) {
			switch (i) {
			case 11:
				cards[count] = "J";
				count++;
				break;
			case 12:
				cards[count] = "Q";
				count++;
				break;
			case 13:
				cards[count] = "K";
				count++;
				break;
			case 14:
				cards[count] = "A";
				count++;
				break;

			default:
				cards[count] = "" + i;
				count++;
				break;
			}
			
		}
		
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (cards[i] == cards[j]) {
					continue;
				}
				for (int fs = 0; fs < suit.length; fs++) {
					for (int ss = fs + 1; ss < suit.length; ss++) {
						for (int ts = ss + 1; ts < suit.length; ts++) {
							for (int k = 0; k < suit.length; k++) {
								for (int t = k + 1; t < suit.length; t++) {
									fullHouse.append('(');
									fullHouse.append(cards[i]);
									fullHouse.append(suit[fs]);
									fullHouse.append(' ');
									fullHouse.append(cards[i]);
									fullHouse.append(suit[ss]);
									fullHouse.append(' ');
									fullHouse.append(cards[i]);
									fullHouse.append(suit[ts]);
									fullHouse.append(' ');
									fullHouse.append(cards[j]);
									fullHouse.append(suit[k]);
									fullHouse.append(' ');
									fullHouse.append(cards[j]);
									fullHouse.append(suit[t]);
									fullHouse.append(' ');
									fullHouse.append(')');
									fullHouse.append(' ');
									counter++;
								}
								
							}
							
						}
					}
				}
				
			}	
		}
		System.out.print(fullHouse.toString());
		System.out.println(counter);

	}

}
