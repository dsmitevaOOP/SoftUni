import java.util.Scanner;


public class OKSecond {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		boolean found = false;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		
		for (int a = 0; a < num.length; a++) {
			for (int b = 0; b < num.length; b++) {
				for (int c = 0; c < num.length; c++) {
					
					if (num[a] <= num[b]) {
						
					
						if ((num[a] * num[a]) + (num[b] * num[b]) == (num[c] * num[c])) {
							System.out.println(num[a] + "*" + num[a] + " +" + " " + num[b] + "*" + num[b] + " =" + " " + 
									num[c] + "*" + num[c]);
										found = true;
						}
					}
					
				}
			}
		}
		
		if (found == false) {
			System.out.println("No");
		}

	}
}
