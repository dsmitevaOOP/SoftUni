import java.util.Arrays;
import java.util.Scanner;


public class SortArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		String[] arr = new String[number];
		for (int i = 0; i < arr.length; i++){
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
			input.close();
		}
	}

}
