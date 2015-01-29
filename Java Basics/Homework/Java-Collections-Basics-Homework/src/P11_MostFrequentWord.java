import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class P11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] data = input.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		for (String word : data) {
			if (words.containsKey(word)) {
				words.put(word, words.get(word) + 1);
			}
			else {
				words.put(word, 1);
			}
		}
		for (Entry<String, Integer> word : words.entrySet()) {
			System.out.println(word);
		}
	}

}
