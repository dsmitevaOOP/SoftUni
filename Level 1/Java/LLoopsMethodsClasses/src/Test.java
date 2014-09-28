import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String str = input.nextLine(); 
		//str = input.nextLine(); 
		String[] parts = str.split("[\\W]+"); 
		System.out.println(parts.length);
		
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
	}
}
