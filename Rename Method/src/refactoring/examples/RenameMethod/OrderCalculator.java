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

	// #1: Can be renamed
	public double calculateTotal() {
		double subtotal = itemCount * itemPrice;
		double total = subtotal - (subtotal * discount);

		return DoTest(total);
	}
	
	// #2: Can be renamed to calculateTotal, but will cause a problem (double definition).
		public double calculateTotal2() {
			double subtotal = itemCount * itemPrice;
			double total = subtotal - (subtotal * discount);

			return DoTest(total);
		}

	private double DoTest(double total) {

		return total * 1.03;
	}

}
