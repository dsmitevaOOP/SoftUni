import java.util.Scanner;


public class BitOneCount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num = input.nextInt();
		int mask = 1;
		int count = 0;
		
		for (int i = 0; i < 32; i++) {
			
			int temp = mask << i;
			
			if (((temp & num) >> i) == 1) {
				
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
