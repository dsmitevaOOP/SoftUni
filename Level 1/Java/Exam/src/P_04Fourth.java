import java.util.ArrayList;
import java.util.Scanner;


public class P_04Fourth {

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
			
		int[] occ = new int[my.size() / 2];
		int[] first = new int[my.size() / 2];
		int[] sec = new int[my.size() / 2];
		int f = 0;
		int s = 0;
		int counter = 0;
		int coup = my.size() - 1;
		
		for (int i = 0; i < occ.length; i++) {
			occ[i] = 0;
		}
		
		for (int i = 0; i < first.length; i = i + 1) {
			first[f] = Integer.parseInt(my.get(i));
			f++;
		}
		
		for (int i = 0; i < sec.length; i = i + 1) {
			sec[s] = Integer.parseInt(my.get(i));
			s++;
		}
		
		for (int i = 0; i < sec.length; i = i + 1) {
			System.out.println(first[i]);
			System.out.println(first[i]);
		}
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[j - 1] == first[i] && num[j] == sec[i]) {
					occ[counter]++;
				}
			}
			counter++;
		}
		System.out.println(my.size());
		
		for (int i = 0; i < occ.length; i++) {
			double t =  occ[i] / coup * 100;
			System.out.printf("%1$d %2$d  -> %3$.2f", first[i], sec[i], t);
			System.out.println();
		}
		
	}
}