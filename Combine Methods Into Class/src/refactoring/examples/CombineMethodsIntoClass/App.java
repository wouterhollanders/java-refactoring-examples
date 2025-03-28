package refactoring.examples.CombineMethodsIntoClass;

public class App {

	public static void main(String[] args) {
		String original = "Hello, World!";
		String reversed = StringUtils.reverse(original);

		int a = 5;
		int b = 3;
		int sum = MathUtils.add(a, b);
		int product = MathUtils.multiply(a, b);

		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " * " + b + " = " + product);
	}
}
