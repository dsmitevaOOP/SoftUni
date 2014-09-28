import java.util.Scanner;


public class PointInsideTheHouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		while (true) {
		
			boolean inside = false;
			
			double x = input.nextDouble();
			double y = input.nextDouble();
			
			double ax = 12.5;
			double ay = 8.5;
			
			double bx = 22.5;
			double by = 8.5;
			
			double cx = 17.5;
			double cy = 3.5;
			
			double areaTriangle = TriangleArea(ax, ay, bx, by, cx, cy);
			
			double FirstSubTrArea = TriangleArea(ax, ay, bx, by, x, y);
			double SecondSubTrArea = TriangleArea(ax, ay, x, y, cx, cy);
			double ThirdSubTrArea = TriangleArea(x, y, bx, by, cx, cy);
			
			double sum = FirstSubTrArea + SecondSubTrArea + ThirdSubTrArea;
	
			if ((sum == areaTriangle) || FirstSubTrArea == 0 || sum == 0 || ThirdSubTrArea == 0) {
				
				inside = true;
			}
			else if ((x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) || (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5)) {
				
				inside = true;
			}
			
			if (inside == true) {
				
				System.out.println("Inside");
			}
			else {
				
				System.out.println("Outside");
			}
		}
	}

	
	public static double TriangleArea (double ax, double ay, 
			double bx, double by, double cx, double cy) {

		double area = ax * (by - cy) + bx * (cy - ay) + cx * (ay - by);
		area = area / 2;
		area = Math.abs(area);
		return area;
	}
}
