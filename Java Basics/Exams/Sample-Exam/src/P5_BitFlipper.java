import java.math.BigInteger;
import java.util.Scanner;

public class P5_BitFlipper {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BigInteger number = input.nextBigInteger();

		for (int bit = 63; bit >= 2; bit--) {
			// test if the bits are 1;
			if (number.testBit(bit) && number.testBit(bit - 1) && number.testBit(bit - 2)) {
				number = number.flipBit(bit);
				number = number.flipBit(bit - 1);
				number = number.flipBit(bit - 2);
				bit -= 2;
			} else if (!number.testBit(bit) && !number.testBit(bit - 1) && !number.testBit(bit - 2)) {
				number = number.flipBit(bit);
				number = number.flipBit(bit - 1);
				number = number.flipBit(bit - 2);
				bit -= 2;
			}
		}
		System.out.println(number);
		// System.out.println("1110111100000000111000111100000001111111000010000111101111100000");

	}
}
