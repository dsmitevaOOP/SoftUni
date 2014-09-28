import java.util.Scanner;


public class SymmetricNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int first = input.nextInt();
		int second = input.nextInt();
		
		for (int i = first; i <= second; i++) { 
			
			if (i > 0 && i < 10) {
				
				System.out.print(i + " ");
				
			}
			
			if (i > 9 && i < 100) {
				
				int begin = i / 10;
				int end = i % 10;
				
				if (begin == end) {
					
					System.out.print(i + " ");
					
				}
				
			}
			
			if (i > 99 && i <= 999) {
				
				int begin = i / 100;
				int end = i % 10;
				
				if (begin == end) {
					System.out.print(i + " ");
				}
				
			}
		}
	}
}