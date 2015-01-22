import java.util.Scanner;


public class P7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		long number = input.nextLong();

		int count = 0;
		for (int bit = 0; bit < 64; bit++) {
		    long currentBit = (number >> bit) & 1L;
		    if(currentBit == 1){
		        count++;
		    }
		}
		System.out.println(count);

	}

}
