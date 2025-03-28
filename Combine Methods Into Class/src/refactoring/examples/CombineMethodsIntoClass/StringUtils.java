package refactoring.examples.CombineMethodsIntoClass;

public class StringUtils {
	// A simple string reversal method
	public static String reverse(String input) {
		if (input == null) {
			return null;
		}
		return new StringBuilder(input).reverse().toString();
	}

	// A method to count vowels in a string
	public static int countVowels(String input) {
		if (input == null) {
			return 0;
		}
		int count = 0;
		String vowels = "aeiouAEIOU";
		for (char c : input.toCharArray()) {
			if (vowels.indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}
}
