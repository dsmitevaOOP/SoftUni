import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int area = (int) a * b;
		System.out.printf("The area of the rectangle is %d", area);

	}

}
