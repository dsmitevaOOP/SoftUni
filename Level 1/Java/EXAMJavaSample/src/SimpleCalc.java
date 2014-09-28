import java.util.Scanner;


public class SimpleCalc {
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		double x = Double.parseDouble(input.nextLine());
		double y = Double.parseDouble(input.nextLine());

		if (x == 0 && y == 0)
		{
			System.out.println(0);
		}

		if (x == 0 && y != 0)
		{
			System.out.println(5);
		}

		if (x != 0 && y == 0)
		{
			System.out.println(6);
		}

		if (x > 0)
		{
			if (y > 0)
			{
				System.out.println(1);
			}

			if (y < 0)
			{
				System.out.println(4);
			}
		}

		if (x < 0)
		{
			if (y > 0)
			{
				System.out.println(2);
			}

			if (y < 0)
			{
				System.out.println(3);
			}
		}
	}
}
