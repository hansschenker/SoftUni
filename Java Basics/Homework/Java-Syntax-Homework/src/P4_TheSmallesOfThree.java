import java.util.Scanner;


public class P4_TheSmallesOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double firstNum = input.nextDouble();
		double secondNum = input.nextDouble();
		double thirdNum = input.nextDouble();
		
		double smalles = Math.min(Math.min(firstNum, secondNum), thirdNum);
		System.out.println(smalles);

	}

}
