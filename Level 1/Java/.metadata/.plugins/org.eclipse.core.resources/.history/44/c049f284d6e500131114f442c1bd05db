import java.util.Scanner;


public class PointsInsideHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double xPointATriangle = 12.5;
		double yPointATriangle = 8.5;
		
		double xPointBTriangle = 22.5;
		double yPointBTriangle = 8.5;
		
		double xPointCTriangle = 17.5;
		double yPointCTriangle = 3.5;
		
		System.out.print("Enter x and y, each on a new line: ");
		double inputX = Double.parseDouble(input.nextLine());
		double inputY = Double.parseDouble(input.nextLine());
		
		if ((inputX >= 12.5 && inputX <= 17.5) && (inputY <= 13.5 && inputY >= 8.5)) {
			System.out.println("Inside");
		}
		else if ((inputX >= 20 && inputX <= 22.5) && (inputY <= 13.5 && inputY >= 8.5)) {
			System.out.println("Inside");
		}
		else {
			double areaABC = Math.abs(xPointATriangle * (yPointBTriangle - yPointCTriangle) + xPointBTriangle * (yPointCTriangle - yPointATriangle) + xPointCTriangle * (yPointATriangle - yPointBTriangle));
			double areaABP = Math.abs(xPointATriangle * (yPointBTriangle - inputY) + xPointBTriangle * (inputY - yPointATriangle) + inputX * (yPointATriangle - yPointBTriangle));
			double areaBCP = Math.abs(inputX * (yPointBTriangle - yPointCTriangle) + xPointBTriangle * (yPointCTriangle - inputY) + xPointCTriangle * (inputY - yPointBTriangle));
			double areaACP = Math.abs(xPointATriangle * (inputY - yPointCTriangle) + inputX * (yPointCTriangle - yPointATriangle) + xPointCTriangle * (yPointATriangle - inputY));
			
			if (areaABC == areaABP + areaBCP + areaACP ) {
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
			}
		}
		
		input.close();
		

	}

}
