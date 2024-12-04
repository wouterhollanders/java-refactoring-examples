package refactoring.examples.RenameMethod;

public class OrderCalculator {
	private int itemCount;
	private double itemPrice;
	private double discount;

	public OrderCalculator(int itemCount, double itemPrice, double discount) {
		this.itemCount = itemCount;
		this.itemPrice = itemPrice;
		this.discount = discount;
	}

	// Method to be refactored (Rename Method)
	public double calculateTotal() {
		double subtotal = itemCount * itemPrice;
		double total = subtotal - (subtotal * discount);

		return DoTest(total);
	}

	private double DoTest(double total) {

		return total * 1.03;
	}

}
