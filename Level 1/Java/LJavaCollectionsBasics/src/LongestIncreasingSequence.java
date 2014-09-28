import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] numb = input.nextLine().split(" ");
		int[] numbers = new int[numb.length];
		//ArrayList<Integer> longest = new ArrayList<>();
		int length = 1;
		int temp = 1;
		int pos = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numb[i]);
		}
		
			System.out.print(numbers[0] + " ");
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i - 1] < numbers[i]) {
				temp++;
				System.out.print(numbers[i] + " ");
			} else {
				temp = 1;
				System.out.println();
				System.out.print(numbers[i] + " ");
			}
			
			if (temp > length) {
				length = temp;
				pos = i;
			}
		}
		
		System.out.println();

		System.out.print("Longest: ");
		
		for (int j = 0; j < length - 1; j++) {
			// positionOfWord - (counter - 1) + j
			System.out.print(numbers[pos - length + 1 + j] + " ");
		}
		System.out.println(numbers[pos]);
	}

}
