import java.util.ArrayList;
import java.util.Scanner;


public class P_05Fifth {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] line = in.nextLine().split(" ");
		long[] num = new long[line.length];
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
		
		double[] occ = new double[my.size()];
		long[] first = new long[my.size()];
		long[] sec = new long[my.size()];
		long f = 0;
		long counter = 0;
		double coup = num.length - 1;
		
		for (int i = 0; i < occ.length; i++) {
			occ[i] = 0;
		}
		
		for (int i = 0; i < my.size(); i++) {
			String[] arr = my.get(i).split(" ");
			//System.out.println(arr[0]);
			//System.out.println(arr[1]);
			if (f< first.length) {
				first[(int) f] = Integer.parseInt(arr[0]);
				sec[(int) f] = Integer.parseInt(arr[1]);
				f++;
			}
			
		}
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[j - 1] == first[i] && num[j] == sec[i]) {
					occ[(int) counter]++;
				}
			}
			counter++;
		}
		
		for (int i = 0; i < occ.length ; i++) {
			double t =  occ[i] / coup * 100;
			System.out.printf("%1$d %2$d -> %3$.2f", first[i], sec[i], t);
			System.out.print("%");
			System.out.println();
		}

	}

}
