import java.util.Locale;
import java.util.Scanner;


public class PointsInsideAFigure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		while (true) {
			
			float x = input.nextFloat();
			float y = input.nextFloat();
			
			if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 13.5) {
				
				if (y > 8.5 && y <= 13.5 && x > 17.5 && x < 20) {
					
					System.out.println("Outside");
				}
				
				else if (y == 8.5 && x >= 12.5 && x <= 22.5) {
					
					System.out.println("Inside");
					
				}
				else {
					System.out.println("Inside");
				}
				
			}
			else {
				System.out.println("Outside");
			}
		}

	}

}
