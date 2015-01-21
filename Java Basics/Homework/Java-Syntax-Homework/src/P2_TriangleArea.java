import java.util.Scanner;


public class P2_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double aX = input.nextDouble();
		double aY = input.nextDouble();
		double bX = input.nextDouble();
		double bY = input.nextDouble();
		double cX = input.nextDouble();
		double cY = input.nextDouble();
		
		double area = (aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY)) / 2d;
		if (area < 0) {
			area = area * -1d;
		}
		System.out.println((int) area);

	}

}
