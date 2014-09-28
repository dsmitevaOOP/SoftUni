import java.util.Scanner;


public class DecToHex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		String hex = Integer.toHexString(num);
		
		System.out.println("Hex value is " + hex.toUpperCase());
		System.out.printf("Hex: %X", num);
	}
}
