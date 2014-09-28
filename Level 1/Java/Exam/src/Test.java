import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
		
		String[] line = in.nextLine().split(" ");
		int[] num = new int[line.length];
		ArrayList<String> my = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < line.length; i++) {
			num[i] = Integer.parseInt(line[i]);
		}
		
		String temp = "" + num[0] + " " +  num[1];
		my.add(temp);
		
		for (int i = 1; i < num.length - 1; i++) {
						
		if (num[i - 1] == num[i] && (num[i] == num[i + 1])) {
				continue;
			} else if (my.contains("" +  num[i] + " " + num[i + 1])) {
				continue;
			} else {
				sb.append("" + num[i]);
				sb.append(" ");
				sb.append("" +  num[i + 1]);
				temp = sb.toString();
				my.add(sb.toString());
				sb = new StringBuilder();
			}
		}
		
  }
}