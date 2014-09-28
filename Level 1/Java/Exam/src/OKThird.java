import java.util.ArrayList;
import java.util.Scanner;


public class OKThird {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		String[] line = input.nextLine().split("[\\D]+");
		int[] first = new int[line.length / 2];
		int[] sec = new int[line.length / 2];
		int cf = 0;
		int cs = 0;
		double area = 0;
		int sum = 0;
		int max = 0;
		int a1 = 0;
		int b1 = 0;
		int a2 = 0;
		int b2 = 0;
		int a3 = 0;
		int b3 = 0;
		
		for (int i = 1; i < line.length; i = i + 2) {
			first[cf] = Integer.parseInt(line[i]);
			cf++;
		}
		
		for (int i = 2; i < line.length; i = i + 2) {
			sec[cs] = Integer.parseInt(line[i]);
			cs++;
		}
		
		for (int i = 2; i < sec.length; i++) {
			area = first[i - 2] * sec[i - 2];
			sum = (int) (sum + area);
			area = first[i - 1] * sec[i - 1];
			sum = (int) (sum + area);
			area = first[i] * sec[i];
			sum = (int) (sum + area);
			
			if (sum > max) {
				max = sum;
				a1 = first[i - 2];
				a2 = first[i - 1];
				a3 = first[i];
				
				b1 = sec[i - 2];
				b2 = sec[i - 1];
				b3 = sec[i];
			}
			
			sum = 0;
			area = 0;
		}
		max = (int) max;
		System.out.println(max);
	}
}