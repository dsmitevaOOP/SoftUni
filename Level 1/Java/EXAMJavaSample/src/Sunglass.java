import java.util.Scanner;


public class Sunglass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

		for (int i = 0; i <= n / 2; i++)
		{
			String dots = Create('.', i);
			String stars = Create('*', n - 2 * i);
			System.out.print(dots);
			System.out.print(stars);
			System.out.print(dots);
			System.out.println();
		}

		for (int i = n / 2 - 1; i >= 0; i--)
		{
			String dots = Create('.', i);
			String stars = Create('*', n - 2 * i);
			System.out.print(dots);
			System.out.print(stars);
			System.out.print(dots);
			System.out.println();
		}
		
	}
	
	public static String Create (char symbol, int n){
		 
		 StringBuilder sb = new StringBuilder();
        
		 for (int i = 0; i < n; i++) {
			 sb.append(symbol);
        }
        return sb.toString();
}

}
