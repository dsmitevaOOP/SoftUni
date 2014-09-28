import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ax = input.nextInt();
		int ay = input.nextInt();
		int bx = input.nextInt();
		int by = input.nextInt();
		int cx = input.nextInt();
		int cy = input.nextInt();
		double area = ax * (by - cy) + bx * (cy - ay) + cx * (ay - by);
		area = area / 2;
		area = Math.abs((int) area);
		System.out.printf("The area of the triangle is %d", (int) area);
	}

}
