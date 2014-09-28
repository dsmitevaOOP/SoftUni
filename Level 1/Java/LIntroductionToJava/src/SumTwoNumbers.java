import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		int second = input.nextInt();
		int sum = first + second;
		System.out.println(sum);
		input.close();
	}

}
