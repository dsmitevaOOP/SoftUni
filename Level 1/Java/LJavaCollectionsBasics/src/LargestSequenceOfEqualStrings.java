import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] arr = line.split(" ");
		int temp = 1;
		int length = 1;
		int pos = 0; 

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				temp++;
			} else {
				temp = 1;
			}
			if (temp > length) {
				length = temp;
				pos = i;
			}
		}
		for (int j = 0; j < length - 1; j++) {
			System.out.print(arr[pos] + " ");
		}
		System.out.println(arr[pos]);
		
	}
}
