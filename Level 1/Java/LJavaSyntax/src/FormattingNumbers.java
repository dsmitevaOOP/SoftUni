import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char table = '|';
		
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		String binString = Integer.toBinaryString(a);
		binString = String.format("%10s", binString);
		
		System.out.print(table);
		System.out.printf("%-10X", a);
		System.out.print(table);
		System.out.printf(binString.replace(" ", "0"));
		System.out.print(table);
		System.out.printf("%10.2f", b);
		System.out.print(table);
		System.out.printf("%-10.3f", c);
		System.out.print(table);
	}

}
