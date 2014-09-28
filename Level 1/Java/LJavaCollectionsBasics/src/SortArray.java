import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class SortArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
