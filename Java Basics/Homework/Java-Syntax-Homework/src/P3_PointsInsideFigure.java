import java.util.Scanner;


public class P3_PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();

		if (isInside(x, y)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
	
	private static boolean isInside(double x, double y) {
		boolean isInside = false;
		if ((x >= 12.5d && x <= 22.5d && y >= 6d && y <= 8.5) ||
			(x >= 12.5d && x <= 17.5d && y >= 8.5d && y <= 13.5d) ||
			(x >= 20d && x <= 22.5d && y >= 8.5d && y <= 13.5d)) {
			isInside = true;
		}
		
		
		return isInside;
		
	}

}
