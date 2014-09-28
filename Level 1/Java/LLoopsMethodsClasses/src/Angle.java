import java.util.Scanner;


public class Angle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String st = input.nextLine();
		double res = 0;
		String mes = "";
		
		for (int i = 0; i < n; i++) {
			String str = input.nextLine();
			String[] temp = str.split(" ");
			double angle = Double.parseDouble(temp[0]);
			
			if (temp[1].equals("deg")) {
				res = toRad(angle);
				mes = "rad";
			}
			
			if (temp[1].equals("rad")) {
				res = toDegrees(angle);
				mes = "deg";
			}
			
			System.out.printf("%.6f %s", res, mes);
		}

	}
	
public static double toDegrees(double rad) {
		
		double degrees = (rad * 180) / Math.PI;
		return degrees;
	}

public static double toRad(double deg) {
	
	double rad = ( deg * Math.PI) / 180;
	return rad;
}

}
