package refactoring.examples.RenameMethod;

public class App {

	public static void main(String[] args) {
		OrderCalculator order = new OrderCalculator(5, 10.0, 0.1);
		double total = order.calculateTotal();
		System.out.println("The total amount is: " + total);
	}

}
