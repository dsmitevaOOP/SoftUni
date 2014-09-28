import java.util.Scanner;


public class TheSmallest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double min = a;

		if (b < min) {
		
			min = b;
		}

		if (c < min) {
		
			min = c;
		}
		
		System.out.printf("The smallest number is %.3f", min);
	}
}
