import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		int num = input.nextInt();
		int lastPos = LastIndex(num);
		
		int countOne = 0;
		int countZero = 0;
		
		int maskOne = 3;
		
		for (int i = 0; i < 32; i++) {
			
			int temp = maskOne << i;
			
			if (((temp & num) >> i) == maskOne) {
				
				countOne++;
			}
		}
		
		for (int i = 0; i < lastPos; i++) {
			
			int temp = maskOne << i;
			
			if (((temp & num) >> i) == 0) {
				
				countZero++;
			}
		}
		
		System.out.println(countOne + countZero);
	}
	
	
	
	public static int LastIndex (int num) {
		
		int mask = 1;
		int pos = 0;
		
		for (int i = 0; i < 32; i++) {
			
			int temp = mask << i;
			
			if (((temp & num) >> i) == 1) {
				
				pos = i;
			}
		}
		
		return pos;
	}

}
